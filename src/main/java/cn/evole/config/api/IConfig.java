/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.api;

public interface IConfig {
    IConfig load(boolean save);

    IConfig load();

    IConfig save();

    String getPathToFile();
}