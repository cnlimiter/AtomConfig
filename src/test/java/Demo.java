import cn.evolvefield.config.base.serialization.ConfigurationSerialization;

import java.io.File;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 19:53
 * Description:
 */
public class Demo {

    private static DemoConfig demoConfig = new DemoConfig(new File("xxxxxx"));
    private static PojoConfig pojoConfig = new PojoConfig(new File("xxxxxx"));

    public static void main(String[] args) {
        ConfigurationSerialization.registerClass(Pojo.class);//注册序列对象

        demoConfig.load();
        pojoConfig.load();
    }
}
