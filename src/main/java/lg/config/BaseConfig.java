package lg.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * author: LG
 * date: 2019-09-06 13:56
 * desc:
 * 程序加载代码的顺序，为下面标的
 *
 * private String version;
 * private String name;
 * 这样没有赋值的常量，不会被赋值
 * 但是debugger是 显示null
 * 应该和常量加载时候一起被赋值为null
 */
@Configuration
@ConfigurationProperties(prefix = "spring.application")
@Data
public class BaseConfig {
    private String version;
    private String name;

    @Value("${number}")
    private String number;

//    // 一
//    static {
//        System.out.println("静态0");
//    }
//    // 二
//    private static int age = 11;
//    // 五
//    private  int a = 11;
//    // 三
//    static {
//        System.out.println("静态1");
//    }
//    // 七
//    public BaseConfig (){
//        System.out.println("构造方法");
//        System.out.println("name：" + name);
//        System.out.println("age：" + age);
//    }
//    // 六
//    private  int b = 11;
//    // 四
//    static {
//        System.out.println("静态2");
//    }
//    // 八
//    public void setVersion(String version) {
//        System.out.println("@value");
//        this.version = version;
//    }
//
}
