
package cn.evolvefield.config.data.base;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigData;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataInteger
        extends AbstractConfigData<Integer> {
    public ConfigDataInteger() {
        super(Integer.class, int.class);
    }

    @Override
    public Integer get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getInt(path) : null;
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isInt(path);
    }

    @Override
    public Integer getDefault() {
        return Integer.MIN_VALUE;
    }
}
