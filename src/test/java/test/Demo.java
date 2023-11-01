package test;


import cn.evole.config.yaml.serialization.ConfigurationSerialization;

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
    private static final PojoYmlConfig pojoYmlConfig = new PojoYmlConfig(new File("D:\\workspace\\minecraft\\common\\Atom\\AtomConfig\\AtomConfig\\run\\"));

    public static void main(String[] args) {
        ConfigurationSerialization.registerClass(Pojo.class);//注册序列对象

        demoConfig.load();
        demoConfig.helloWorld = "test";
        demoConfig.save();
        pojoYmlConfig.load();
        Pojo pojo = new Pojo("test", 0);
        pojoYmlConfig.setPojo(pojo);
        pojoYmlConfig.getPojo().setId(1);
        pojoYmlConfig.save();

        //System.out.println(objects);

    }
}
