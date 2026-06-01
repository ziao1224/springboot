package com.cqupt.boot303logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class HelloController {
    @GetMapping("/h")
    public String hello(String a,String b) {
//        Logger logger = LoggerFactory.getLogger(getClass());
        for (int i = 0; i < 1000; i++) {
            log.trace("trace");
            log.debug("debug");
            log.info("info a {} b {}",a,b);
            log.warn("warn");
            log.error("error");
        }

//        持久化保存，输出到文件里


//        log.info("方法");
        return "Hello World";
    }
}
