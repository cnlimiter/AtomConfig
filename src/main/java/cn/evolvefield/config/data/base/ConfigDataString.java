
package cn.evolvefield.config.data.base;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigData;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataString
        extends AbstractConfigData<String> {
    public ConfigDataString() {
        super(String.class);
    }

    @Override
    public String get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getString(path) : null;
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isString(path);
    }

    @Override
    public String getDefault() {
        return "";
    }
}
