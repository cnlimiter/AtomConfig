package cn.evolvefield.config.base.serialization;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * Project: atomlib
 * Author: cnlimiter
 * Date: 2022/12/21 13:26
 * Description:
 */
public interface ConfigurationSerializable {
    @NotNull
    public Map<String, Object> serialize();
}
