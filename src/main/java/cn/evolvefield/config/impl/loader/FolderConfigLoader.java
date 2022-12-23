package cn.evolvefield.config.impl.loader;

import cn.evolvefield.config.api.loader.IConfigLoader;
import cn.evolvefield.config.impl.Config;
import lombok.AllArgsConstructor;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 18:27
 * Description:
 */
@AllArgsConstructor
public class FolderConfigLoader<T extends Config> implements IConfigLoader<T, File> {
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
