package test;


import cn.evole.config.bukkit.serialization.ConfigurationSerializable;
import cn.evole.config.bukkit.serialization.SerializableAs;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 20:01
 * Description:自定义序列对象
 */
@Builder
@ToString
@AllArgsConstructor
@SerializableAs("Pojo")
public class Pojo implements ConfigurationSerializable {
    private String name;

    private int id;

    public static Pojo deserialize(Map<String, Object> serialized) {
        return Pojo.builder()
                .name((String) serialized.get("Name"))
                .id((int) serialized.get("Id"))
                .build();
    }

    @Override
    public Map<String, Object> serialize() {
        Map<String, Object> serlialized = new HashMap<>();

        serlialized.put("Name", this.name);
        serlialized.put("Id", this.id);

        return serlialized;
    }
}
