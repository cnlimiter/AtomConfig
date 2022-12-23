import cn.evolvefield.config.Config;
import cn.evolvefield.config.annotations.ConfigComments;
import cn.evolvefield.config.annotations.ConfigField;

import java.io.File;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 19:55
 * Description:
 */
@ConfigComments({"Header Comment"})
public class DemoConfig extends Config {

    @ConfigField("One.Two")
    @ConfigComments({"# First comment line", "# Second comment line"})
    public String helloWorld = "Hello, world!";


    public DemoConfig(File folder) {
        super(folder.getAbsolutePath() + File.separator + "config.yml");
    }

}
