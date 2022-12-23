
package cn.evolvefield.config.data.list;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigDataList;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataListDouble
        extends AbstractConfigDataList<Double> {
    public ConfigDataListDouble() {
        super(Double.class, double.class);
    }

    @Override
    public List<Double> get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getDoubleList(path) : null;
    }
}
