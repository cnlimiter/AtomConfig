/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.bukkit;

import com.google.common.base.Preconditions;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
public class MemoryConfiguration
        extends MemorySection
        implements Configuration {
    @Getter
    protected Configuration defaults;

    protected MemoryConfigurationOptions options;

    public MemoryConfiguration(Configuration defaults) {
        this.defaults = defaults;
    }

    @Override
    public void addDefault(String path, Object value) {
        Preconditions.checkNotNull(path, "Path may not be null");

        if (this.defaults == null) {
            this.defaults = new MemoryConfiguration();
        }

        this.defaults.set(path, value);
    }

    public void addDefaults(Map<String, Object> defaults) {
        Preconditions.checkNotNull(defaults, "Defaults may not be null");

        defaults.forEach(this::addDefault);
    }

    public void addDefaults(Configuration defaults) {
        Preconditions.checkNotNull(defaults, "Defaults may not be null");

        this.addDefaults(defaults.getValues(true));
    }

    public void setDefaults(Configuration defaults) {
        Preconditions.checkNotNull(defaults, "Defaults may not be null");

        this.defaults = defaults;
    }

    @Override
    public ConfigurationSection getParent() {
        return null;
    }

    public MemoryConfigurationOptions options() {
        if (this.options == null) {
            this.options = new MemoryConfigurationOptions(this);
        }

        return this.options;
    }
}