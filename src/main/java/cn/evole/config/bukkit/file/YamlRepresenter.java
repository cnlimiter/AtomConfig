/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.bukkit.file;

import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.representer.Representer;
import cn.evole.config.bukkit.ConfigurationSection;
import cn.evole.config.bukkit.serialization.ConfigurationSerializable;
import cn.evole.config.bukkit.serialization.ConfigurationSerialization;

import java.util.LinkedHashMap;
import java.util.Map;

public class YamlRepresenter
        extends Representer {
    public YamlRepresenter() {
        this.multiRepresenters.put(ConfigurationSection.class, new RepresentConfigurationSection());
        this.multiRepresenters.put(ConfigurationSerializable.class, new RepresentConfigurationSerializable());
    }

    private class RepresentConfigurationSection
            extends RepresentMap {
        @Override
        public Node representData(Object data) {
            return super.representData(((ConfigurationSection) data).getValues(false));
        }
    }

    private class RepresentConfigurationSerializable
            extends RepresentMap {
        @Override
        public Node representData(Object data) {
            Map<String, Object> values = new LinkedHashMap<>();

            ConfigurationSerializable serializable = (ConfigurationSerializable) data;

            values.put(ConfigurationSerialization.SERIALIZED_TYPE_KEY, ConfigurationSerialization.getAlias(serializable.getClass()));
            values.putAll(serializable.serialize());

            return super.representData(values);
        }
    }
}