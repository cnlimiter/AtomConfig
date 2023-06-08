/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.impl;

import lombok.Builder;
import lombok.Value;
import cn.evole.config.data.types.AbstractConfigData;

@Value
@Builder
public class SerializationOptions {
    AbstractConfigData<?> data;

    String[] comments;

    String path;
}