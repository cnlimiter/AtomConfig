/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.data.base;

import cn.evole.config.data.types.AbstractConfigData;
import cn.evole.config.yaml.file.FileConfiguration;
import lombok.EqualsAndHashCode;

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