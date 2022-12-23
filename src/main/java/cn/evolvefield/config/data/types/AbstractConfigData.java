
package cn.evolvefield.config.data.types;

import cn.evolvefield.config.Config;
import cn.evolvefield.config.base.impl.file.FileConfiguration;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.lang.reflect.Field;
import java.util.logging.Logger;

@Getter
@AllArgsConstructor
@EqualsAndHashCode(doNotUseGetters = true)
public abstract class AbstractConfigData<T> {
    protected static Logger logger = Logger.getLogger(Config.class.getName());

    private ConfigurationDataType type = ConfigurationDataType.OBJECT;

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
