
package cn.evolvefield.config.data.map;

import cn.evolvefield.config.base.api.ConfigurationSection;
import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigData;
import cn.evolvefield.config.data.types.AbstractConfigDataMap;
import cn.evolvefield.config.impl.handler.ConfigDataHandler;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataMapString
        extends AbstractConfigDataMap<String> {
    public ConfigDataMapString() {
        super(String.class);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void set(FileConfiguration configuration, String path, Map<String, ?> values, Field field) {
        values.forEach((key, value) ->
        {
            Optional<AbstractConfigData> optionalConfigurationData = ConfigDataHandler.getInstance().getType(value.getClass());

            if (optionalConfigurationData.isPresent()) {
                optionalConfigurationData.get().set(configuration, path + "." + key, value, field);
            } else {
                logger.warning("[EAPI] Can't set value with key '" + key + "' to map: " + path);
            }
        });
    }

    @Override
    public Map<String, ?> get(FileConfiguration configuration, String path, Field field) {
        Map<String, Object> values = new HashMap<>();

        ConfigurationSection section = configuration.getConfigurationSection(path);

        if (section == null) {
            return null;
        }

        section.getValues(false).forEach((key, value) ->
        {
            Class<?> objectType = value.getClass();

            Optional<AbstractConfigData> optionalConfigurationData = ConfigDataHandler.getInstance().getType(objectType);

            if (optionalConfigurationData.isPresent()) {
                values.put(key, optionalConfigurationData.get().get(configuration, path + "." + key, field));
            } else {
                values.put(key, configuration.get(path + "." + key));
            }
        });

        return values.isEmpty() ? null : values;
    }

    @Override
    public Map<String, ?> getDefault() {
        return Collections.emptyMap();
    }
}
