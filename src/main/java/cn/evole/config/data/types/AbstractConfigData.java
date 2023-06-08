/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.data.types;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import cn.evole.config.YmlConfig;
import cn.evole.config.bukkit.file.FileConfiguration;

import java.lang.reflect.Field;
import java.util.logging.Logger;

@Getter
@AllArgsConstructor
@EqualsAndHashCode(doNotUseGetters = true)
public abstract class AbstractConfigData<T> {
    protected static Logger logger = Logger.getLogger(YmlConfig.class.getName());

    private ConfigDataType type = ConfigDataType.OBJECT;

    private Class<?>[] typeClasses;

    public AbstractConfigData(Class<?>... typeClasses) {
        this.typeClasses = typeClasses;
    }

    public void set(FileConfiguration configuration, String path, T value, Field field) {
        configuration.set(path, value);
    }

    @SuppressWarnings("unchecked")
    public T get(FileConfiguration configuration, String path, Field field) {
        return (T) configuration.get(path);
    }

    public abstract boolean isValid(FileConfiguration configuration, String path);

    public T getDefault() {
        return null;
    }
}