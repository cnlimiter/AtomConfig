
package cn.evolvefield.config.data.base;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigData;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataCharacter
        extends AbstractConfigData<Character> {
    public ConfigDataCharacter() {
        super(Character.class, char.class);
    }

    @Override
    public Character get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getCharacter(path) : null;
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isCharacter(path);
    }

    @Override
    public Character getDefault() {
        return 0;
    }
}
