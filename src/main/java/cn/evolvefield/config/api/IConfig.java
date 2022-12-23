package cn.evolvefield.config.api;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 18:20
 * Description:
 */
public interface IConfig {
    IConfig load(boolean save);

    IConfig load();

    IConfig save();

    String getPathToFile();
}
