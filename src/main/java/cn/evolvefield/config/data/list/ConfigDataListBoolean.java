
package cn.evolvefield.config.data.list;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigDataList;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataListBoolean
        extends AbstractConfigDataList<Boolean> {
    public ConfigDataListBoolean() {
        super(Boolean.class, boolean.class);
    }

    @Override
    public List<Boolean> get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getBooleanList(path) : null;
    }
}
