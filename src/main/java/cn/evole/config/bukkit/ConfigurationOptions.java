/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.bukkit;

import lombok.Getter;

public class ConfigurationOptions {
    @Getter
    private final Configuration configuration;

    @Getter
    private char pathSeparator = '.';

    @Getter
    private boolean copyDefaults;

    protected ConfigurationOptions(Configuration configuration) {
        this.configuration = configuration;
    }

    public ConfigurationOptions pathSeparator(char value) {
        this.pathSeparator = value;
        return this;
    }

    public ConfigurationOptions copyDefaults(boolean value) {
        this.copyDefaults = value;
        return this;
    }
}