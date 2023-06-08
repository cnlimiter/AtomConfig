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