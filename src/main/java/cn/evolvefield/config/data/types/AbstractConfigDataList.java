
package cn.evolvefield.config.data.types;

import cn.evolvefield.config.base.impl.file.FileConfiguration;
import lombok.EqualsAndHashCode;

import java.util.Collections;
import java.util.List;

@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
public abstract class AbstractConfigDataList<T>
        extends AbstractConfigData<List<T>> {
    public AbstractConfigDataList(Class<?>... typeClasses) {
        super(ConfigurationDataType.LIST, typeClasses);
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
