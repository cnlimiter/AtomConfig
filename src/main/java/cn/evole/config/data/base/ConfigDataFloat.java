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