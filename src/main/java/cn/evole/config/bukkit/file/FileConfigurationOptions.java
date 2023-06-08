/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.bukkit.file;

import lombok.Getter;
import cn.evole.config.bukkit.MemoryConfiguration;
import cn.evole.config.bukkit.MemoryConfigurationOptions;

@Getter
public class FileConfigurationOptions
        extends MemoryConfigurationOptions {
    private String header;

    private boolean copyHeader = true;

    protected FileConfigurationOptions(MemoryConfiguration configuration) {
        super(configuration);
    }

    @Override
    public FileConfiguration getConfiguration() {
        return (FileConfiguration) super.getConfiguration();
    }

    @Override
    public FileConfigurationOptions copyDefaults(boolean value) {
        super.copyDefaults(value);
        return this;
    }

    @Override
    public FileConfigurationOptions pathSeparator(char value) {
        super.pathSeparator(value);
        return this;
    }

    public FileConfigurationOptions header(String value) {
        this.header = value;
        return this;
    }

    public FileConfigurationOptions copyHeader(boolean value) {
        this.copyHeader = value;
        return this;
    }
}