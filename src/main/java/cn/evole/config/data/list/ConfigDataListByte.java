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
public class ConfigDataListByte
        extends AbstractConfigDataList<Byte> {
    public ConfigDataListByte() {
        super(Byte.class, byte.class);
    }

    @Override
    public List<Byte> get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getByteList(path) : null;
    }
}