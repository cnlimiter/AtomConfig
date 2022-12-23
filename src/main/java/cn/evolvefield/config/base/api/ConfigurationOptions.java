package cn.evolvefield.config.base.api;


import org.jetbrains.annotations.NotNull;

public class ConfigurationOptions {
    private final Configuration configuration;
    private char pathSeparator = '.';
    private boolean copyDefaults = false;

    protected ConfigurationOptions(@NotNull Configuration configuration) {
        this.configuration = configuration;
    }


    @NotNull
    public Configuration configuration() {
        return configuration;
    }


    public char pathSeparator() {
        return pathSeparator;
    }


    @NotNull
    public ConfigurationOptions pathSeparator(char value) {
        this.pathSeparator = value;
        return this;
    }


    public boolean copyDefaults() {
        return copyDefaults;
    }


    @NotNull
    public ConfigurationOptions copyDefaults(boolean value) {
        this.copyDefaults = value;
        return this;
    }
}
