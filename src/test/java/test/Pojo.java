package test;


import cn.evole.config.api.ConfigComments;
import cn.evole.config.api.ConfigField;
import cn.evole.config.yaml.serialization.ConfigurationSerializable;
import cn.evole.config.yaml.serialization.SerializableAs;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 20:01
 * Description:自定义序列对象
 */
@SerializableAs("Pojo")
public class Pojo implements ConfigurationSerializable {
    @ConfigField("name")
    @ConfigComments("name")
    private String name;

    @ConfigField("id")
    @ConfigComments("id")
    private int id;

    public Pojo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static Pojo valueOf(Map<String, Object> map) {
        return new Pojo(
                (map.get("Name") != null ? (String) map.get("Name") : ""),
                (map.get("Id") != null ? (Integer) map.get("Id") : 0)
        );
    }

    public static Pojo deserialize(Map<String, Object> map) {
        return new Pojo(
                (map.get("Name") != null ? (String) map.get("Name") : ""),
                (map.get("Id") != null ? (Integer) map.get("Id") : 0)
        );
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public @NotNull Map<String, Object> serialize() {
        Map<String, Object> serlialized = new HashMap<>();

        serlialized.put("Name", this.name);
        serlialized.put("Id", this.id);

        return serlialized;
    }
}
