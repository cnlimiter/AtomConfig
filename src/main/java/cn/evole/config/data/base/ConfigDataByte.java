/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.data.base;

import lombok.EqualsAndHashCode;
import cn.evole.config.bukkit.file.FileConfiguration;
import cn.evole.config.data.types.AbstractConfigData;

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