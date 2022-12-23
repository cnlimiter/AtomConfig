
package cn.evolvefield.config.data.list;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigDataList;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataListLong
        extends AbstractConfigDataList<Long> {
    public ConfigDataListLong() {
        super(Long.class, long.class);
    }

    @Override
    public List<Long> get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getLongList(path) : null;
    }
}
