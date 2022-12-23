
package cn.evolvefield.config.data.base;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigData;
import lombok.EqualsAndHashCode;

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
