
package cn.evolvefield.config.data.base;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigData;
import lombok.EqualsAndHashCode;

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
