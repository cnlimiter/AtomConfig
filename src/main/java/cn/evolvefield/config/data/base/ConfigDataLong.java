
package cn.evolvefield.config.data.base;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigData;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataLong
        extends AbstractConfigData<Long> {
    public ConfigDataLong() {
        super(Long.class, long.class);
    }

    @Override
    public Long get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getLong(path) : null;
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isLong(path);
    }

    @Override
    public Long getDefault() {
        return Long.MIN_VALUE;
    }
}
