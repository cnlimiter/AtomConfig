/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.data.types;

import cn.evole.config.yaml.file.FileConfiguration;
import lombok.EqualsAndHashCode;

import java.util.Collections;
import java.util.Map;

@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
public abstract class AbstractConfigDataMap<T>
        extends AbstractConfigData<Map<T, Object>> {
    public AbstractConfigDataMap(Class<?>... typeClasses) {
        super(ConfigDataType.MAP, typeClasses);
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isConfigurationSection(path);
    }

    @Override
    public Map<T, Object> getDefault() {
        return Collections.emptyMap();
    }
}