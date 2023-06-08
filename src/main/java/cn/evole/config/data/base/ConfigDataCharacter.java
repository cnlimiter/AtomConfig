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