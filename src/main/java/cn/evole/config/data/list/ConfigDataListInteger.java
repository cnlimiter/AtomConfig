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