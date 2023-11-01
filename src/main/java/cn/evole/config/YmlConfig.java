/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config;

import cn.evole.config.api.ConfigComments;
import cn.evole.config.api.ConfigField;
import cn.evole.config.api.IConfig;
import cn.evole.config.data.types.AbstractConfigData;
import cn.evole.config.impl.ConfigDataManager;
import cn.evole.config.impl.SerializationOptions;
import cn.evole.config.impl.YamlEffectiveModel;
import cn.evole.config.yaml.file.YamlConfiguration;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public class YmlConfig
        implements IConfig {
    private static final Logger logger = Logger.getLogger(YmlConfig.class.getName());

    protected String pathToFile;

    @SneakyThrows
    private YmlConfig loadData(File file, boolean save) {
        Multimap<String, String> comments = MultimapBuilder.hashKeys().arrayListValues().build();

        YamlConfiguration configuration = new YamlConfiguration();

        configuration.load(file);

        boolean updated = false;

        ConfigComments header = this.getClass().getAnnotation(ConfigComments.class);

        if (header != null) {
            configuration.options().setHeader(List.of(Joiner.on("\r\n").join(header.value())));
        }

        for (Map.Entry<Field, SerializationOptions> fieldData : this.getFieldsData().entrySet()) {
            Field field = fieldData.getKey();

            SerializationOptions serializationOptions = fieldData.getValue();

            AbstractConfigData<Object> configurationData = (AbstractConfigData<Object>) serializationOptions.getData();

            String path = serializationOptions.getPath();

            String[] fieldComments = serializationOptions.getComments();

            if (fieldComments != null) {
                comments.putAll(path, Arrays.asList(fieldComments));
            }

            boolean accessible = field.isAccessible();

            try {
                field.setAccessible(true);

                Object configValue = configurationData.get(configuration, path, field);

                if (configValue == null) {
                    try {
                        configValue = field.get(this);

                        configurationData.set(configuration, path, configValue != null ?
                                configValue : configurationData.getDefault(), field);

                        updated = true;
                    } catch (Exception e) {
                        logger.warning("Could not get value from field '" + field.getName() +
                                "', path '" + path + "' and set it to configuration!");
                        e.printStackTrace();
                    }

                    continue;
                }

                try {
                    field.set(this, configValue);
                } catch (Exception e) {
                    logger.warning("Could not set value in field from configuration file, path to file '" +
                            this.pathToFile + "', path in configuration '" + path + "'!");
                    e.printStackTrace();
                }
            } finally {
                field.setAccessible(accessible);
            }
        }

        if (save && updated) {
            configuration.save(file);
        }

        this.addCommentsToFile(comments, configuration, file);
        return this;
    }

    @SneakyThrows
    @SuppressWarnings("unchecked")
    private YmlConfig saveData(File file) {
        Multimap<String, String> comments = MultimapBuilder.hashKeys().arrayListValues().build();

        YamlConfiguration configuration = new YamlConfiguration();

        configuration.load(file);

        boolean hasChanges = false;

        ConfigComments header = this.getClass().getAnnotation(ConfigComments.class);

        if (header != null) {
            configuration.options().setHeader(List.of(Joiner.on("\r\n").join(header.value())));
        }

        for (Map.Entry<Field, SerializationOptions> fieldData : this.getFieldsData().entrySet()) {
            Field field = fieldData.getKey();

            SerializationOptions serializationOptions = fieldData.getValue();

            String path = serializationOptions.getPath();

            AbstractConfigData<Object> configurationData = (AbstractConfigData<Object>) serializationOptions.getData();

            String[] fieldComments = serializationOptions.getComments();

            if (fieldComments != null) {
                comments.putAll(path, Arrays.asList(fieldComments));
            }

            boolean accessible = field.isAccessible();

            try {
                field.setAccessible(true);

                Object fieldValue;

                try {
                    fieldValue = field.get(this);
                } catch (IllegalStateException | IllegalAccessException e) {
                    logger.warning("Could not get value from configuration class: " +
                            this.getClass().getName() + ", path: " + path);
                    continue;
                }

                Object configValue = configurationData.get(configuration, path, field);

                if (fieldValue != null && !fieldValue.equals(configValue) ||
                        configValue != null && !configValue.equals(fieldValue)) {
                    configurationData.set(configuration, path, fieldValue, field);

                    hasChanges = true;
                }
            } finally {
                field.setAccessible(accessible);
            }
        }

        if (hasChanges) {
            configuration.save(file);
        }

        this.addCommentsToFile(comments, configuration, file);
        return this;
    }

    private LinkedHashMap<Field, SerializationOptions> getFieldsData() {
        LinkedHashMap<Field, SerializationOptions> fieldsData = new LinkedHashMap<>();

        Stream.of(this.getClass().getDeclaredFields())
                .filter((field) -> field.isAnnotationPresent(ConfigField.class))
                .forEach((field) ->
                {
                    ConfigField data = field.getAnnotation(ConfigField.class);
                    ConfigComments comments = field.getAnnotation(ConfigComments.class);

                    Optional<AbstractConfigData<?>> optionalConfigurationData = ConfigDataManager.getInstance().getType(field);

                    if (optionalConfigurationData.isPresent()) {
                        SerializationOptions.SerializationOptionsBuilder serializationOptions =
                                SerializationOptions.builder()
                                        .data(optionalConfigurationData.get())
                                        .path(data.value().isEmpty() ? field.getName() : data.value());

                        if (comments != null) {
                            serializationOptions.comments(comments.value());
                        }

                        fieldsData.put(field, serializationOptions.build());
                    } else {
                        logger.warning("Can't find configuration data for field: " + field.getName());
                    }
                });

        return fieldsData;
    }

    /*
     * This is not fully tested yet
     * and there is probably a better
     * way to write comments to the yaml
     * file, but at least it works.
     */
    private void addCommentsToFile(Multimap<String, String> comments, YamlConfiguration configuration, File file) {
        if (comments.isEmpty()) {
            return;
        }

        int configurationIndent = configuration.options().indent();

        YamlEffectiveModel yamlEffectiveModel = new YamlEffectiveModel();

        List<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (yamlEffectiveModel.isKey(line)) {
                    long lineIndent = yamlEffectiveModel.getIndent(line) / configurationIndent,
                            currentIndent = yamlEffectiveModel.getCurrentIndent();

                    String key = yamlEffectiveModel.toKey(line);

                    if (currentIndent == lineIndent) {
                        if (yamlEffectiveModel.size() == 0) {
                            yamlEffectiveModel.addKey(key);
                        } else {
                            yamlEffectiveModel.replaceCurrentKey(key);
                        }
                    } else if (currentIndent < lineIndent) {
                        yamlEffectiveModel.addKey(key);
                    } else {
                        yamlEffectiveModel.removeKeys((currentIndent - lineIndent) + 1);
                        yamlEffectiveModel.addKey(key);
                    }

                    yamlEffectiveModel.setCurrentIndent(lineIndent);
                } else {
                    comments.values().removeIf(line::contains);
                }

                String currentPath = yamlEffectiveModel.getCurrentPath();

                Iterator<Map.Entry<String, String>> commentsEntries = comments.entries().iterator();

                while (commentsEntries.hasNext()) {
                    Map.Entry<String, String> commentEntry = commentsEntries.next();

                    if (!currentPath.equals(commentEntry.getKey())) {
                        break;
                    }

                    String comment = commentEntry.getValue(),
                            trimmed = comment.startsWith("#") ? comment.trim() : "#" + comment.trim();

                    lines.add(Strings.repeat
                            (
                                    " ",
                                    ((int) yamlEffectiveModel.getCurrentIndent() * configurationIndent)
                            ) + trimmed);

                    commentsEntries.remove();
                }

                lines.add(line);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(file)) {
            lines.forEach(printWriter::println);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    private YmlConfig load(String path, boolean save) {
        return this.load(new File(path), save);
    }

    private YmlConfig load(String path) {
        return this.load(new File(path));
    }

    private YmlConfig save(String path) {
        return this.save(new File(path));
    }

    @SneakyThrows
    private YmlConfig load(File file, boolean save) {
        this.createFile(file);

        return this.loadData(file, save);
    }

    @Override
    public YmlConfig load(boolean save) {
        return this.load(this.pathToFile, save);
    }

    @SneakyThrows
    private YmlConfig load(File file) {
        return this.load(file, true);
    }

    @Override
    public IConfig load() {
        return this.load(this.pathToFile);
    }

    @SneakyThrows
    private YmlConfig save(File file) {
        this.createFile(file);

        return this.saveData(file);
    }

    @Override
    public YmlConfig save() {
        return this.save(this.pathToFile);
    }

    @SneakyThrows
    private void createFile(File file) {
        if (file.exists()) {
            return;
        }

        file.getParentFile().mkdirs();
        file.createNewFile();
    }
}