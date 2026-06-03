package com.cqupt.boot304web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

@Configuration //这是一个配置类，给容器中放置一个WebMvcConfigurer组件，就能自定义底层

public class MyConfig /*implements WebMvcConfigurer*/ {
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                WebMvcConfigurer.super.addResourceHandlers(registry);
            }
        };
    }
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        //super保留以前的默认配置
//        WebMvcConfigurer.super.addResourceHandlers(registry);
//        //自己写
//        registry.addResourceHandler("/static/**")
//                .addResourceLocations("classpath:/static1/")
//                .setCacheControl(CacheControl.maxAge(7199, TimeUnit.SECONDS));
//
//    }
}
