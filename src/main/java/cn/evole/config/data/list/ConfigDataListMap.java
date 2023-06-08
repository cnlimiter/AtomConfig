/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.data.list;

import lombok.EqualsAndHashCode;
import cn.evole.config.bukkit.file.FileConfiguration;
import cn.evole.config.data.types.AbstractConfigDataList;

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