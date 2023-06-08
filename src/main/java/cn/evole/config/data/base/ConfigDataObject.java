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
public class ConfigDataObject
        extends AbstractConfigData<Object> {
    public ConfigDataObject() {
        super(Object.class);
    }

    @Override
    public Object get(FileConfiguration configuration, String path, Field field) {
        return configuration.get(path);
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isSet(path);
    }
}