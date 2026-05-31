package com.cqupt.boot;

import com.cqupt.boot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //这是一个spring boot应用
public class MainApplication {
    public static void main(String[] args) {
        var ioc =SpringApplication.run(MainApplication.class,args);
        String[] names=ioc.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
        Person person=ioc.getBean(Person.class);
        System.out.println("person:"+person);

    }
}
