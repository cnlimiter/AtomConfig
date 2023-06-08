/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.api;

import cn.evole.config.YmlConfig;

import java.util.List;

/**
 * Loads already created
 * configuration files using
 * the specified template
 */
public interface IConfigLoader<T extends YmlConfig, S> {
    List<T> load(Class<T> templateClass, S source);
}