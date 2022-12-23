
package cn.evolvefield.config.data.list;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigDataList;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataListString
        extends AbstractConfigDataList<String> {
    public ConfigDataListString() {
        super(String.class);
    }

    @Override
    public List<String> get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getStringList(path) : null;
    }
}
