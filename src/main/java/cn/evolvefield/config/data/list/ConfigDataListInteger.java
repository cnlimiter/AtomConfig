
package cn.evolvefield.config.data.list;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigDataList;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataListInteger
        extends AbstractConfigDataList<Integer> {
    public ConfigDataListInteger() {
        super(Integer.class, int.class);
    }

    @Override
    public List<Integer> get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getIntegerList(path) : null;
    }
}
