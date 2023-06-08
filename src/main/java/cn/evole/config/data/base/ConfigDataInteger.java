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