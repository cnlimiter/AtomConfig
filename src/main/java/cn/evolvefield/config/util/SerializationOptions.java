package cn.evolvefield.config.util;

import cn.evolvefield.config.data.types.AbstractConfigData;
import lombok.Builder;
import lombok.Value;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 18:21
 * Description:
 */
@Value
@Builder
public class SerializationOptions {
    AbstractConfigData<?> data;

    String[] comments;

    String path;
}
