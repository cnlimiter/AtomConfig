/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.data.map;

import cn.evole.config.data.types.AbstractConfigData;
import cn.evole.config.data.types.AbstractConfigDataMap;
import cn.evole.config.impl.ConfigDataManager;
import cn.evole.config.yaml.ConfigurationSection;
import cn.evole.config.yaml.file.FileConfiguration;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataMapEnum<E extends Enum<E>>
        extends AbstractConfigDataMap<E> {
    public ConfigDataMapEnum() {
        super(Enum.class);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void set(FileConfiguration configuration, String path, Map<E, Object> values, Field field) {
        values.forEach((key, value) ->
        {
            Optional<AbstractConfigData<?>> optionalConfigurationData = ConfigDataManager.getInstance().getType(value.getClass());

            if (optionalConfigurationData.isPresent()) {
                ((AbstractConfigData<Object>) optionalConfigurationData.get()).set(configuration, path + "." + key, value, field);
            } else {
                logger.warning("Can't set value with key '" + key.name() + "' to map, path '" + path + "'");
            }
        });
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<E, Object> get(FileConfiguration configuration, String path, Field field) {
        Map<E, Object> values = new HashMap<>();

        ConfigurationSection section = configuration.getConfigurationSection(path);

        if (section == null) {
            return null;
        }

        section.getValues(false).forEach((key, value) ->
        {
            Class<?> objectType = value.getClass();

            Optional<AbstractConfigData<?>> optionalConfigurationData = ConfigDataManager.getInstance().getType(objectType);

            if (optionalConfigurationData.isPresent()) {
                values.put(Enum.valueOf(((Class<E>) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0]), key),
                        optionalConfigurationData.get().get(configuration, path + "." + key, field));
            } else {
                values.put(Enum.valueOf(((Class<E>) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0]), key),
                        configuration.get(path + "." + key));
            }
        });

        return values.isEmpty() ? null : values;
    }

    @Override
    public Map<E, Object> getDefault() {
        return super.getDefault();
    }
}