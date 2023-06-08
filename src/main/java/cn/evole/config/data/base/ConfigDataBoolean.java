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
public class ConfigDataBoolean
        extends AbstractConfigData<Boolean> {
    public ConfigDataBoolean() {
        super(Boolean.class, boolean.class);
    }

    @Override
    public Boolean get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getBoolean(path) : null;
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isBoolean(path);
    }

    @Override
    public Boolean getDefault() {
        return false;
    }
}