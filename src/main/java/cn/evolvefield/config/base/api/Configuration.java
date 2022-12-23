package cn.evolvefield.config.base.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;


public interface Configuration extends ConfigurationSection {

    @Override
    public void addDefault(@NotNull String path, @Nullable Object value);


    public void addDefaults(@NotNull Map<String, Object> defaults);


    public void addDefaults(@NotNull Configuration defaults);

    @Nullable
    public Configuration getDefaults();

    public void setDefaults(@NotNull Configuration defaults);

    @NotNull
    public ConfigurationOptions options();
}
