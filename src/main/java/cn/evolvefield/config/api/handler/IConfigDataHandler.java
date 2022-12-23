package cn.evolvefield.config.api.handler;

import cn.evolvefield.config.data.types.AbstractConfigData;

import java.lang.reflect.Field;
import java.util.Optional;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 18:24
 * Description:
 */
public interface IConfigDataHandler {
    Optional<AbstractConfigData> getType(Class<?> clazz);

    Optional<AbstractConfigData> getType(Field field);

    void register(AbstractConfigData<?> configurationData);

    void remove(AbstractConfigData<?> configurationData);
}
