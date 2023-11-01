/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.data.list;

import cn.evole.config.data.types.AbstractConfigDataList;
import cn.evole.config.yaml.file.FileConfiguration;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataListCharacter
        extends AbstractConfigDataList<Character> {
    public ConfigDataListCharacter() {
        super(Character.class, char.class);
    }

    @Override
    public List<Character> get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getCharacterList(path) : null;
    }
}