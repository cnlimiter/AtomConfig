
package cn.evolvefield.config.data.types;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import lombok.EqualsAndHashCode;

import java.util.Collections;
import java.util.Map;

@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
public abstract class AbstractConfigDataMap<T>
        extends AbstractConfigData<Map<T, ?>> {
    public AbstractConfigDataMap(Class<?>... typeClasses) {
        super(ConfigurationDataType.MAP, typeClasses);
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isConfigurationSection(path);
    }

    @Override
    public Map<T, ?> getDefault() {
        return Collections.emptyMap();
    }
}
