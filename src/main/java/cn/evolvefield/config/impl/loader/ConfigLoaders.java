package cn.evolvefield.config.impl.loader;

import cn.evolvefield.config.impl.Config;
import lombok.experimental.UtilityClass;

import java.io.File;
import java.util.List;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 18:28
 * Description:
 */
@UtilityClass
public class ConfigLoaders {
    public <T extends Config> List<T> fromFolder(Class<T> templateTypeClass,
                                                 File folder, boolean deep) {
        return new FolderConfigLoader<T>(deep).load(templateTypeClass, folder);
    }

    public <T extends Config> List<T> fromPath(Class<T> templateTypeClass,
                                               String path, boolean deep) {
        return fromFolder(templateTypeClass, new File(path), deep);
    }
}
