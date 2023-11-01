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