package com.cqupt.boot304web.controller;

import com.cqupt.boot304web.bean.Person;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @GetMapping("/a*/b?/**/{p1:[a-f]+}/**")
    public String hello(HttpServletRequest request, @PathVariable("p1") String path) {
        log.info("路径变量p1:{}",path);
        String uri = request.getRequestURI();
        return uri;
    }

    /**
     * 默认支持把对象写成json格式
     * jackson也支持把数据写成xml,需要导入包
     * @return
     */
    @GetMapping("/person")
    public Person person(){
        Person person = new Person();
        person.setUsername("aa");
        person.setEmail("bb");
        person.setId("123");
        person.setAge(30);
        return person;

    }
}
