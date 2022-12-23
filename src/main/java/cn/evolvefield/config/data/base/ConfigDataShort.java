
package cn.evolvefield.config.data.base;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigData;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataShort
        extends AbstractConfigData<Short> {
    public ConfigDataShort() {
        super(Short.class, short.class);
    }

    @Override
    public Short get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getShort(path) : null;
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isShort(path);
    }

    @Override
    public Short getDefault() {
        return Short.MIN_VALUE;
    }
}
