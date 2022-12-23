
package cn.evolvefield.config.data.base;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigData;
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
