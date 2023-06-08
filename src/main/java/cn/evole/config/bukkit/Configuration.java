/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.bukkit;

import java.util.Map;

public interface Configuration
        extends ConfigurationSection {
    void addDefault(String path, Object value);

    void addDefaults(Map<String, Object> defaults);

    void addDefaults(Configuration defaults);

    Configuration getDefaults();

    void setDefaults(Configuration defaults);

    ConfigurationOptions options();
}