
package cn.evolvefield.config.data.list;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigDataList;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataListFloat
        extends AbstractConfigDataList<Float> {
    public ConfigDataListFloat() {
        super(Float.class, float.class);
    }

    @Override
    public List<Float> get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getFloatList(path) : null;
    }
}
