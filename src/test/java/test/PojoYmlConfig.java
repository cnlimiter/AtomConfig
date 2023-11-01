package test;

import cn.evole.config.YmlConfig;
import cn.evole.config.api.ConfigComments;
import cn.evole.config.api.ConfigField;

import java.io.File;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 20:03
 * Description:
 */
public class PojoYmlConfig extends YmlConfig {
    @ConfigField("test.Pojo")
    @ConfigComments("1111")
    public Pojo pojo;

    public PojoYmlConfig(File folder) {
        super(folder.getAbsolutePath() + File.separator + "pojo.yml");
    }

    public Pojo getPojo() {
        return pojo;
    }

    public void setPojo(Pojo pojo) {
        this.pojo = pojo;
    }
}
