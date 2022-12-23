
package cn.evolvefield.config.data.base;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import cn.evolvefield.config.data.types.AbstractConfigData;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataByte
        extends AbstractConfigData<Byte> {
    public ConfigDataByte() {
        super(Byte.class, byte.class);
    }

    @Override
    public Byte get(FileConfiguration configuration, String path, Field field) {
        return configuration.isSet(path) ? configuration.getByte(path) : null;
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isByte(path);
    }

    @Override
    public Byte getDefault() {
        return Byte.MIN_VALUE;
    }
}
