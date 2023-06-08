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