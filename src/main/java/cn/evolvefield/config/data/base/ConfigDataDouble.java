
package cn.evolvefield.config.data.base;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigData;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataDouble
        extends AbstractConfigData<Double> {
    public ConfigDataDouble() {
        super(Double.class, double.class);
    }

    @Override
    public Double get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getDouble(path) : null;
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isDouble(path);
    }

    @Override
    public Double getDefault() {
        return Double.MIN_VALUE;
    }
}
