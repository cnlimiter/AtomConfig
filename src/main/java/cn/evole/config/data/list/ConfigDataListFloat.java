/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.data.list;

import cn.evole.config.data.types.AbstractConfigDataList;
import cn.evole.config.yaml.file.FileConfiguration;
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