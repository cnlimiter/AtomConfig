
package cn.evolvefield.config.data.list;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigDataList;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataList
        extends AbstractConfigDataList<Object> {
    @Override
    @SuppressWarnings("unchecked")
    public List<Object> get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? (List<Object>) configuration.getList(path) : null;
    }
}
