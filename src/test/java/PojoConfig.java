import cn.evolvefield.config.Config;
import cn.evolvefield.config.annotations.ConfigField;
import lombok.Getter;

import java.io.File;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 20:03
 * Description:
 */
@Getter
public class PojoConfig extends Config {
    @ConfigField("Pojo")
    public Pojo pojo = new Pojo("pojo", 1);

    public PojoConfig(File folder) {
        super(folder.getAbsolutePath() + File.separator + "messages.yml");
    }
}
