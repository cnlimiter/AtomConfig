
package cn.evolvefield.config.data.list;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigDataList;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataListMap
        extends AbstractConfigDataList<Map<?, ?>> {
    public ConfigDataListMap() {
        super(Map.class);
    }

    @Override
    public List<Map<?, ?>> get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getMapList(path) : null;
    }
}
