package com.cqupt.boot302demo.config;

//import com.alibaba.druid.FastsqlException;
import com.cqupt.boot302demo.bean.Cat;
import com.cqupt.boot302demo.bean.Dog;
import com.cqupt.boot302demo.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
@ConditionalOnMissingClass(value = "com.alibaba.druid.FastsqlException") //放在类级别，如果注解判断生效，则整个配置类才生效。
@SpringBootConfiguration
public class AppConfig2 {

    @ConditionalOnClass(name = "com.alibaba.druid.FastsqlException")
    @Bean
    public Cat cat01(){
        return new Cat();
    }


    @Bean
    public Dog dog01(){
        return new Dog();
    }

    @ConditionalOnBean(value = Dog.class)
    @Bean
    public User zhangsan01(){
        return new User();
    }
    @ConditionalOnMissingBean(Dog.class)
    @Bean
    public User lisi01(){
        return new User();
    }
}
