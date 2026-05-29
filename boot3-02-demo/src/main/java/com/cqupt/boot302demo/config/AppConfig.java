package com.cqupt.boot302demo.config;

//import com.alibaba.druid.FastsqlException;
import com.cqupt.boot302demo.bean.Pig;
import com.cqupt.boot302demo.bean.Sheep;
import com.cqupt.boot302demo.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

//@Import(FastsqlException.class)//给容器中放指定类型的组件，组件名字是全部类

/**
 * 开启sheep组件的属性绑定
 * 默认把这个组件自己放到容器中
 */
@SpringBootConfiguration //这是一个springboot配置类,替代以前的配置文件。配置类本身也是容器中的组件
@EnableConfigurationProperties(Sheep.class) //导入第三方写好的组件进行属性绑定
//springboot默认只扫描自己主程序所在的包，如果导入第三方包，即使组件上标注了@component注解也没用，因为组件扫描不进。
//@Configuration //这是一个配置类,替代以前的配置文件。配置类本身也是容器中的组件
public class AppConfig {
    @Bean
    @ConfigurationProperties(prefix = "pig")
    public Pig pig() {
        return new Pig();
    }

    @Scope("prototype")
    @Bean("userHaha") //替代以前的Bean标签。 组件在容器中的名字默认是方法名，可直接修改注解的值修改
    public User user01(){
        var user = new User();
        user.setId(1L);
        user.setName("张三");
        return user;
    }
//    @Bean
//    public FastsqlException fastsqlException(){
//        return new FastsqlException();
//
//    }









}
