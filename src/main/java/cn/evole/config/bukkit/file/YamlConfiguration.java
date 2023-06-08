/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.bukkit.file;

import com.google.common.base.Preconditions;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.representer.Representer;
import cn.evole.config.bukkit.Configuration;
import cn.evole.config.bukkit.ConfigurationSection;
import cn.evole.config.bukkit.InvalidConfigurationException;

import java.io.*;
import java.util.Map;

public class YamlConfiguration
        extends FileConfiguration {
    protected static final String COMMENT_PREFIX = "# ",
            BLANK_CONFIG = "{}\n";

    private final DumperOptions yamlOptions = new DumperOptions();
    private final Representer yamlRepresenter = new YamlRepresenter();

    private final Yaml yaml = new Yaml(new YamlConstructor(), this.yamlRepresenter, this.yamlOptions);

    public static YamlConfiguration loadConfiguration(File file) {
        Preconditions.checkNotNull(file, "File cannot be null");

        YamlConfiguration config = new YamlConfiguration();

        try {
            config.load(file);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {
            // Bukkit.getLogger().log(Level.SEVERE, "Cannot load " + file, ex);
        } catch (InvalidConfigurationException ex) {
            // Bukkit.getLogger().log(Level.SEVERE, "Cannot load " + file , ex);
        }

        return config;
    }

    @Deprecated
    public static YamlConfiguration loadConfiguration(InputStream stream) {
        Preconditions.checkNotNull(stream, "Stream cannot be null");

        YamlConfiguration config = new YamlConfiguration();

        try {
            config.load(stream);
        } catch (IOException | InvalidConfigurationException ex) {
            // Bukkit.getLogger().log(Level.SEVERE, "Cannot load configuration from stream", ex);
        }

        return config;
    }

    public static YamlConfiguration loadConfiguration(Reader reader) {
        Preconditions.checkNotNull(reader, "Stream cannot be null");

        YamlConfiguration config = new YamlConfiguration();

        try {
            config.load(reader);
        } catch (IOException | InvalidConfigurationException ex) {
            // Bukkit.getLogger().log(Level.SEVERE, "Cannot load configuration from stream", ex);
        }

        return config;
    }

    @Override
    public String saveToString() {
        this.yamlOptions.setIndent(this.options().getIndent());
        this.yamlOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        this.yamlOptions.setAllowUnicode(SYSTEM_UTF);
        this.yamlRepresenter.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);

        String dump = this.yaml.dump(this.getValues(false));

        return this.buildHeader() + (dump.equals(BLANK_CONFIG) ? "" : dump);
    }

    @Override
    public void loadFromString(String contents) throws InvalidConfigurationException {
        Preconditions.checkNotNull(contents, "Contents cannot be null");

        Map<?, ?> input;

        try {
            input = this.yaml.load(contents);
        } catch (YAMLException e) {
            throw new InvalidConfigurationException(e);
        } catch (ClassCastException e) {
            throw new InvalidConfigurationException("Top level is not a Map.");
        }

        String header = parseHeader(contents);

        if (header.length() > 0) {
            this.options().header(header);
        }

        if (input != null) {
            this.convertMapsToSections(input, this);
        }
    }

    protected void convertMapsToSections(Map<?, ?> input, ConfigurationSection section) {
        input.forEach((key, value) ->
        {
            if (value instanceof Map) {
                this.convertMapsToSections((Map<?, ?>) value, section.createSection(key.toString()));
            } else {
                section.set(key.toString(), value);
            }
        });
    }

    protected String parseHeader(String input) {
        String[] lines = input.split("\r?\n", -1);

        StringBuilder result = new StringBuilder();

        boolean readingHeader = true,
                foundHeader = false;

        for (int i = 0; (i < lines.length) && (readingHeader); i++) {
            String line = lines[i];

            if (line.startsWith(COMMENT_PREFIX)) {
                if (i > 0) {
                    result.append("\n");
                }

                if (line.length() > COMMENT_PREFIX.length()) {
                    result.append(line.substring(COMMENT_PREFIX.length()));
                }

                foundHeader = true;
            } else if ((foundHeader) && (line.length() == 0)) {
                result.append("\n");
            } else if (foundHeader) {
                readingHeader = false;
            }
        }

        return result.toString();
    }

    @Override
    protected String buildHeader() {
        String header = this.options().getHeader();

        if (this.options().isCopyHeader()) {
            Configuration def = this.getDefaults();

            if (def instanceof FileConfiguration) {
                FileConfiguration filedefaults = (FileConfiguration) def;
                String defaultsHeader = filedefaults.buildHeader();

                if ((defaultsHeader != null) && (defaultsHeader.length() > 0)) {
                    return defaultsHeader;
                }
            }
        }

        if (header == null) {
            return "";
        }

        StringBuilder builder = new StringBuilder();

        String[] lines = header.split("\r?\n", -1);

        boolean startedHeader = false;

        for (int i = lines.length - 1; i >= 0; i--) {
            builder.insert(0, "\n");

            if ((startedHeader) || (lines[i].length() != 0)) {
                builder.insert(0, lines[i]);
                builder.insert(0, COMMENT_PREFIX);

                startedHeader = true;
            }
        }

        return builder.toString();
    }

    @Override
    public YamlConfigurationOptions options() {
        if (this.options == null) {
            this.options = new YamlConfigurationOptions(this);
        }

        return (YamlConfigurationOptions) this.options;
    }
}