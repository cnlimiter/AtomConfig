/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.impl;

import cn.evole.config.api.IConfigLoader;
import lombok.AllArgsConstructor;
import cn.evole.config.YmlConfig;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class FolderConfigLoader<T extends YmlConfig>
        implements IConfigLoader<T, File> {
    private boolean deep;

    @Override
    public List<T> load(Class<T> templateClass, File folder) {
        List<T> loadedConfigurations = new ArrayList<>();

        if (folder == null || folder.isFile()) {
            return loadedConfigurations;
        }

        File[] files = folder.listFiles();

        if (files == null || files.length < 1) {
            return loadedConfigurations;
        }

        for (File file : files) {
            if (file.isDirectory() && this.deep) {
                loadedConfigurations.addAll(this.load(templateClass, file));
                continue;
            }

            if (!file.getName().endsWith(".yml")) {
                continue;
            }

            T template = null;

            try {
                template = templateClass.getDeclaredConstructor(String.class).newInstance(file.getAbsolutePath());
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                e.printStackTrace();
            }

            if (template == null) {
                continue;
            }

            template.load();

            loadedConfigurations.add(template);
        }

        return loadedConfigurations;
    }
}