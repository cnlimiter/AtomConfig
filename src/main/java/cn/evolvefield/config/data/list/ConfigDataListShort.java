
package cn.evolvefield.config.data.list;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigDataList;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataListShort
        extends AbstractConfigDataList<Short> {
    public ConfigDataListShort() {
        super(Short.class, short.class);
    }

    @Override
    public List<Short> get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getShortList(path) : null;
    }
}
