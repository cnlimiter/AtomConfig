package cn.evole.config.toml;

import cn.evole.config.toml.annotation.Reload;
import cn.evole.config.toml.annotation.TableField;
import org.tomlj.TomlTable;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.file.Path;

import static cn.evole.config.toml.ConfigFileWatcher.CONFIG_FILE_WATCHER;

/**
 * 支持重载的配置类
 *
 * @author Fndream
 */
public abstract class AutoReloadToml extends AutoLoadTomlConfig {
    @TableField(ignore = true)
    private Field field;
    @TableField(ignore = true)
    private Class<?> type;
    @TableField(ignore = true)
    private Path path;
    @TableField(ignore = true)
    private boolean autoReload;
    @TableField(ignore = true)
    public final Path basePath;

    public AutoReloadToml(TomlTable source, Path filePath) {
        super(source);
        this.basePath = filePath;
        try {
            findReloadFieldArgument();
        } catch (Exception ignored) {
        }
        if (field != null && autoReload) {
            CONFIG_FILE_WATCHER.register(this.path.toFile().toString(), this);
        }
    }

    /**
     * 赋值新的配置类实例给被 @{@link Reload} 注解的单例字段
     */
    public void reload() {
        if (this.field == null) {
            findReloadFieldArgument();
        }
        try {
            this.field.set(null, TomlUtil.readConfig(this.path.toFile(), this.type));
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private void findReloadFieldArgument() {
        for (Field field : this.getClass().getDeclaredFields()) {
            Reload reload = field.getAnnotation(Reload.class);
            if (reload == null) {
                continue;
            }

            if (Modifier.isStatic(field.getModifiers()) && field.getType() == this.getClass()) {
                field.setAccessible(true);
                this.field = field;
                this.path = basePath;
                this.type = field.getType();
                this.autoReload = reload.autoReload();
                return;
            }
        }
        throw new IllegalStateException("Failed to reload. Unable to find a valid @Reload field in " + this.getClass().getName() + ".");
    }
}
