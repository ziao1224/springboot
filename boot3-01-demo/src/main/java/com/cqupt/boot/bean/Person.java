package com.cqupt.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "person")
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
    private Date birthday;
    private Boolean like;
    private Child child;
    private List<Dog> dogs;
    private Map<String,Cat> cats;
}
