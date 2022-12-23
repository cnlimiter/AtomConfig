
package cn.evolvefield.config.data.list;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigDataList;
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
