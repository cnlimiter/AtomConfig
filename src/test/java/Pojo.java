import cn.evolvefield.config.base.serialization.ConfigurationSerializable;
import cn.evolvefield.config.base.serialization.SerializableAs;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 20:01
 * Description:自定义序列对象
 */
@Data
@AllArgsConstructor
@SerializableAs("Pojo")
public class Pojo implements ConfigurationSerializable {
    private String name;

    private int id;

    public static Pojo deserialize(Map<String, Object> serialized) {
        return new Pojo((String) serialized.get("Name"), (int) serialized.get("Id"));
    }

    @Override
    public Map<String, Object> serialize() {
        Map<String, Object> serlialized = new HashMap<>();

        serlialized.put("Name", this.name);
        serlialized.put("Id", this.id);

        return serlialized;
    }
}
