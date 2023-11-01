package test;

import cn.evole.config.YmlConfig;
import cn.evole.config.api.ConfigComments;
import cn.evole.config.api.ConfigField;

import java.io.File;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 19:55
 * Description:
 */
@ConfigComments({"Header Comment"})
public class DemoYmlConfig extends YmlConfig {

    @ConfigField("One.Two")
    @ConfigComments({"# First comment line", "# Second comment line"})
    public String helloWorld = "Hello, world!";


    public DemoYmlConfig(File folder) {
        super(folder.getAbsolutePath() + File.separator + "config.yml");
    }

}
