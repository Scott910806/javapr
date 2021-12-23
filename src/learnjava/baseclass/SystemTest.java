package learnjava.baseclass;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) throws Exception{
        // 获取系统环境变量
        Map<String, String> env = System.getenv();
        // 打印环境变量
        for(var name : env.keySet()){
            System.out.println(name + "--->" + env.get(name));
        }
        // 获取指定的环境变量值
        System.out.println(System.getenv("JAVA_HOME"));
        // 获取所有的系统属性
        Properties props = System.getProperties();
        // 将获取到的系统属性保存到文件中
        props.store(new FileOutputStream("props.txt"), "System Properties");
        // 输出特定的系统属性
        System.out.println(System.getProperty("os.name"));
    }
}
