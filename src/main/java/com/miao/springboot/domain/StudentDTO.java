package com.miao.springboot.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("classpath:custom.properties")
@ConfigurationProperties("student")
@Data
public class StudentDTO {

    private String name;
    private int age;
    private List<String> sorce;
    private List<User> studentDTOs;

}
