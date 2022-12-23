
package cn.evolvefield.config.data.list;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigDataList;
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
