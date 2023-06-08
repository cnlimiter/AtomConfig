/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.data.types;

import lombok.EqualsAndHashCode;
import cn.evole.config.bukkit.file.FileConfiguration;

import java.util.Collections;
import java.util.Map;

@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
public abstract class AbstractConfigDataMap<T>
        extends AbstractConfigData<Map<T, ?>> {
    public AbstractConfigDataMap(Class<?>... typeClasses) {
        super(ConfigDataType.MAP, typeClasses);
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