package cn.evolvefield.config.base.impl;


import cn.evolvefield.config.Config;
import cn.evolvefield.config.base.api.ConfigurationSection;
import cn.evolvefield.config.base.exception.InvalidConfigurationException;
import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.base.serialization.ConfigurationSerialization;
import com.google.common.base.Preconditions;
import org.jetbrains.annotations.NotNull;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.comments.CommentLine;
import org.yaml.snakeyaml.comments.CommentType;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.nodes.*;
import org.yaml.snakeyaml.reader.UnicodeReader;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/**
 * Project: atomlib
 * Author: cnlimiter
 * Date: 2022/12/21 13:44
 * Description:
 */
public class YamlConfiguration extends FileConfiguration {
    /**
     * @deprecated unused, not intended to be API
     */
    @Deprecated
    protected static final String COMMENT_PREFIX = "# ";
    /**
     * @deprecated unused, not intended to be API
     */
    @Deprecated
    protected static final String BLANK_CONFIG = "{}\n";
    private final DumperOptions yamlDumperOptions;
    private final LoaderOptions yamlLoaderOptions;
    private final YamlConstructor constructor;
    private final YamlRepresenter representer;
    private final Yaml yaml;

    public YamlConfiguration() {
        constructor = new YamlConstructor();
        representer = new YamlRepresenter();
        representer.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);

        yamlDumperOptions = new DumperOptions();
        yamlDumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        yamlLoaderOptions = new LoaderOptions();
        yamlLoaderOptions.setMaxAliasesForCollections(Integer.MAX_VALUE); // SPIGOT-5881: Not ideal, but was default pre SnakeYAML 1.26
        yamlLoaderOptions.setCodePointLimit(Integer.MAX_VALUE); // SPIGOT-7161: Not ideal, but was default pre SnakeYAML 1.32

        yaml = new Yaml(constructor, representer, yamlDumperOptions, yamlLoaderOptions);
    }

    /**
     * Creates a new {@link YamlConfiguration}, loading from the given file.
     * 加载配置的任何错误都将被记录，然后被忽略。如果指定的输入不是有效的配置，将返回空白配置。
     * 使用的编码可能遵循与系统相关的默认值
     *
     * @param file Input file
     * @return Resulting configuration
     * @throws IllegalArgumentException Thrown if file is null
     */
    @NotNull
    public static YamlConfiguration loadConfiguration(@NotNull File file) {
        Preconditions.checkArgument(file != null, "File cannot be null");

        YamlConfiguration config = new YamlConfiguration();

        try {
            config.load(file);
        } catch (FileNotFoundException ignored) {
        } catch (IOException | InvalidConfigurationException ex) {
            Config.logger.log(Level.SEVERE, "Cannot load " + file, ex);
        }

        return config;
    }

    /**
     * Creates a new {@link YamlConfiguration}, loading from the given reader.
     * <p>
     * Any errors loading the Configuration will be logged and then ignored.
     * If the specified input is not a valid config, a blank config will be
     * returned.
     *
     * @param reader input
     * @return resulting configuration
     * @throws IllegalArgumentException Thrown if stream is null
     */
    @NotNull
    public static YamlConfiguration loadConfiguration(@NotNull Reader reader) {
        Preconditions.checkArgument(reader != null, "Stream cannot be null");

        YamlConfiguration config = new YamlConfiguration();

        try {
            config.load(reader);
        } catch (IOException | InvalidConfigurationException ex) {
            Config.logger.log(Level.SEVERE, "Cannot load configuration from stream", ex);
        }

        return config;
    }

    @NotNull
    @Override
    public String saveToString() {
        yamlDumperOptions.setIndent(options().indent());
        yamlDumperOptions.setWidth(options().width());
        yamlDumperOptions.setProcessComments(options().parseComments());

        MappingNode node = toNodeTree(this);

        node.setBlockComments(getCommentLines(saveHeader(options().getHeader()), CommentType.BLOCK));
        node.setEndComments(getCommentLines(options().getFooter(), CommentType.BLOCK));

        StringWriter writer = new StringWriter();
        if (node.getBlockComments().isEmpty() && node.getEndComments().isEmpty() && node.getValue().isEmpty()) {
            writer.write("");
        } else {
            if (node.getValue().isEmpty()) {
                node.setFlowStyle(DumperOptions.FlowStyle.FLOW);
            }
            yaml.serialize(node, writer);
        }
        return writer.toString();
    }

    @Override
    public void loadFromString(@NotNull String contents) throws InvalidConfigurationException {
        Preconditions.checkArgument(contents != null, "Contents cannot be null");
        yamlLoaderOptions.setProcessComments(options().parseComments());

        MappingNode node;
        try (Reader reader = new UnicodeReader(new ByteArrayInputStream(contents.getBytes(StandardCharsets.UTF_8)))) {
            node = (MappingNode) yaml.compose(reader);
        } catch (YAMLException | IOException e) {
            throw new InvalidConfigurationException(e);
        } catch (ClassCastException e) {
            throw new InvalidConfigurationException("Top level is not a Map.");
        }

        this.map.clear();

        if (node != null) {
            adjustNodeComments(node);
            options().setHeader(loadHeader(getCommentLines(node.getBlockComments())));
            options().setFooter(getCommentLines(node.getEndComments()));
            fromNodeTree(node, this);
        }
    }

    /**
     * This method splits the header on the last empty line, and sets the
     * comments below this line as comments for the first key on the map object.
     *
     * @param node The root node of the yaml object
     */
    private void adjustNodeComments(final MappingNode node) {
        if (node.getBlockComments() == null && !node.getValue().isEmpty()) {
            Node firstNode = node.getValue().get(0).getKeyNode();
            List<CommentLine> lines = firstNode.getBlockComments();
            if (lines != null) {
                int index = -1;
                for (int i = 0; i < lines.size(); i++) {
                    if (lines.get(i).getCommentType() == CommentType.BLANK_LINE) {
                        index = i;
                    }
                }
                if (index != -1) {
                    node.setBlockComments(lines.subList(0, index + 1));
                    firstNode.setBlockComments(lines.subList(index + 1, lines.size()));
                }
            }
        }
    }

    private void fromNodeTree(@NotNull MappingNode input, @NotNull ConfigurationSection section) {
        constructor.flattenMapping(input);
        for (NodeTuple nodeTuple : input.getValue()) {
            Node key = nodeTuple.getKeyNode();
            String keyString = String.valueOf(constructor.construct(key));
            Node value = nodeTuple.getValueNode();

            while (value instanceof AnchorNode) {
                value = ((AnchorNode) value).getRealNode();
            }

            if (value instanceof MappingNode && !hasSerializedTypeKey((MappingNode) value)) {
                fromNodeTree((MappingNode) value, section.createSection(keyString));
            } else {
                section.set(keyString, constructor.construct(value));
            }

            section.setComments(keyString, getCommentLines(key.getBlockComments()));
            if (value instanceof MappingNode || value instanceof SequenceNode) {
                section.setInlineComments(keyString, getCommentLines(key.getInLineComments()));
            } else {
                section.setInlineComments(keyString, getCommentLines(value.getInLineComments()));
            }
        }
    }

    private boolean hasSerializedTypeKey(MappingNode node) {
        for (NodeTuple nodeTuple : node.getValue()) {
            Node keyNode = nodeTuple.getKeyNode();
            if (!(keyNode instanceof ScalarNode)) continue;
            String key = ((ScalarNode) keyNode).getValue();
            if (key.equals(ConfigurationSerialization.SERIALIZED_TYPE_KEY)) {
                return true;
            }
        }
        return false;
    }

    private MappingNode toNodeTree(@NotNull ConfigurationSection section) {
        List<NodeTuple> nodeTuples = new ArrayList<>();
        for (Map.Entry<String, Object> entry : section.getValues(false).entrySet()) {
            Node key = representer.represent(entry.getKey());
            Node value;
            if (entry.getValue() instanceof ConfigurationSection) {
                value = toNodeTree((ConfigurationSection) entry.getValue());
            } else {
                value = representer.represent(entry.getValue());
            }
            key.setBlockComments(getCommentLines(section.getComments(entry.getKey()), CommentType.BLOCK));
            if (value instanceof MappingNode || value instanceof SequenceNode) {
                key.setInLineComments(getCommentLines(section.getInlineComments(entry.getKey()), CommentType.IN_LINE));
            } else {
                value.setInLineComments(getCommentLines(section.getInlineComments(entry.getKey()), CommentType.IN_LINE));
            }

            nodeTuples.add(new NodeTuple(key, value));
        }

        return new MappingNode(Tag.MAP, nodeTuples, DumperOptions.FlowStyle.BLOCK);
    }

    private List<String> getCommentLines(List<CommentLine> comments) {
        List<String> lines = new ArrayList<>();
        if (comments != null) {
            for (CommentLine comment : comments) {
                if (comment.getCommentType() == CommentType.BLANK_LINE) {
                    lines.add(null);
                } else {
                    String line = comment.getValue();
                    line = line.startsWith(" ") ? line.substring(1) : line;
                    lines.add(line);
                }
            }
        }
        return lines;
    }

    private List<CommentLine> getCommentLines(List<String> comments, CommentType commentType) {
        List<CommentLine> lines = new ArrayList<CommentLine>();
        for (String comment : comments) {
            if (comment == null) {
                lines.add(new CommentLine(null, null, "", CommentType.BLANK_LINE));
            } else {
                String line = comment;
                line = line.isEmpty() ? line : " " + line;
                lines.add(new CommentLine(null, null, line, commentType));
            }
        }
        return lines;
    }

    /**
     * Removes the empty line at the end of the header that separates the header
     * from further comments. Also removes all empty header starts (backwards
     * compat).
     *
     * @param header The list of heading comments
     * @return The modified list
     */
    private List<String> loadHeader(List<String> header) {
        LinkedList<String> list = new LinkedList<>(header);

        if (!list.isEmpty()) {
            list.removeLast();
        }

        while (!list.isEmpty() && list.peek() == null) {
            list.remove();
        }

        return list;
    }

    /**
     * Adds the empty line at the end of the header that separates the header
     * from further comments.
     *
     * @param header The list of heading comments
     * @return The modified list
     */
    private List<String> saveHeader(List<String> header) {
        LinkedList<String> list = new LinkedList<>(header);

        if (!list.isEmpty()) {
            list.add(null);
        }

        return list;
    }

    @NotNull
    @Override
    public YamlConfigurationOptions options() {
        if (options == null) {
            options = new YamlConfigurationOptions(this);
        }

        return (YamlConfigurationOptions) options;
    }
}
