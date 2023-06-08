/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.impl;

import lombok.experimental.UtilityClass;
import cn.evole.config.YmlConfig;

import java.io.File;
import java.util.List;

@UtilityClass
public class ConfigLoaders {
    public <T extends YmlConfig> List<T> fromFolder(Class<T> templateTypeClass,
                                                    File folder, boolean deep) {
        return new FolderConfigLoader<T>(deep).load(templateTypeClass, folder);
    }

    public <T extends YmlConfig> List<T> fromPath(Class<T> templateTypeClass,
                                                  String path, boolean deep) {
        return fromFolder(templateTypeClass, new File(path), deep);
    }
}