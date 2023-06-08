/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.data.base;

import lombok.EqualsAndHashCode;
import cn.evole.config.bukkit.file.FileConfiguration;
import cn.evole.config.data.types.AbstractConfigData;

import java.lang.reflect.Field;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataEnum<E extends Enum<E>>
        extends AbstractConfigData<E> {
    public ConfigDataEnum() {
        super(Enum.class);
    }

    @Override
    public void set(FileConfiguration configuration, String path, E value, Field field) {
        configuration.set(path, value.name());
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(FileConfiguration configuration, String path, Field field) {
        String name = configuration.getString(path);

        if (name == null || name.isEmpty()) {
            return null;
        }

        try {
            return Enum.valueOf((Class<E>) field.getType(), name);
        } catch (IllegalArgumentException e) {
            logger.warning("Can't retrieve enum from string: " + path);
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isString(path);
    }
}