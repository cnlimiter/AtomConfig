
package cn.evolvefield.config.data.base;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigData;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataFloat
        extends AbstractConfigData<Float> {
    public ConfigDataFloat() {
        super(Float.class, float.class);
    }

    @Override
    public Float get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getFloat(path) : null;
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isFloat(path);
    }

    @Override
    public Float getDefault() {
        return Float.MIN_VALUE;
    }
}
