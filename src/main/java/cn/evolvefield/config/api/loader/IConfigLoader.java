package cn.evolvefield.config.api.loader;

import cn.evolvefield.config.Config;

import java.util.List;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 18:25
 * Description:
 */
public interface IConfigLoader<T extends Config, S> {
    List<T> load(Class<T> templateClass, S source);
}
