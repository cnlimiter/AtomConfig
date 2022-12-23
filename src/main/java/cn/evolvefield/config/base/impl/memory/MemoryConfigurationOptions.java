package cn.evolvefield.config.base.impl.memory;

import cn.evolvefield.config.base.api.ConfigurationOptions;
import org.jetbrains.annotations.NotNull;

/**
 * Project: atomlib
 * Author: cnlimiter
 * Date: 2022/12/21 13:41
 * Description:
 */
public class MemoryConfigurationOptions extends ConfigurationOptions {
    protected MemoryConfigurationOptions(@NotNull MemoryConfiguration configuration) {
        super(configuration);
    }

    @NotNull
    @Override
    public MemoryConfiguration configuration() {
        return (MemoryConfiguration) super.configuration();
    }

    @NotNull
    @Override
    public MemoryConfigurationOptions copyDefaults(boolean value) {
        super.copyDefaults(value);
        return this;
    }

    @NotNull
    @Override
    public MemoryConfigurationOptions pathSeparator(char value) {
        super.pathSeparator(value);
        return this;
    }
}
