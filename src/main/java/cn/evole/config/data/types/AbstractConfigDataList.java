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
import java.util.List;

@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
public abstract class AbstractConfigDataList<T>
        extends AbstractConfigData<List<T>> {
    public AbstractConfigDataList(Class<?>... typeClasses) {
        super(ConfigDataType.LIST, typeClasses);
    }

    @Override
    public boolean isValid(FileConfiguration configuration, String path) {
        return configuration.isList(path);
    }

    @Override
    public List<T> getDefault() {
        return Collections.emptyList();
    }
}