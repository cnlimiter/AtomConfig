package test;


import cn.evole.config.bukkit.serialization.ConfigurationSerialization;
import cn.evole.config.impl.ConfigLoaders;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 19:53
 * Description:
 */
public class Demo {

    private static final DemoYmlConfig demoConfig = new DemoYmlConfig(new File("D:\\workspace\\minecraft\\common\\Atom\\AtomConfig\\AtomConfig\\run\\"));
    private static final List<Pojo> objects = new ArrayList<>();

    public static void main(String[] args) {
        ConfigurationSerialization.registerClass(Pojo.class);//注册序列对象

        demoConfig.load();
        List<PojoYmlConfig> testConfig = ConfigLoaders.fromPath
                (
                        PojoYmlConfig.class,
                        "D:\\workspace\\minecraft\\common\\Atom\\AtomConfig\\AtomConfig\\run\\" + File.separator + "test",
                        true
                );

        testConfig.forEach((template) -> objects.add(template.getPojo()));

        System.out.println(objects);

    }
}
