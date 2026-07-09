package com.example.skillcheck;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.skillcheck.mapper")
public class SkillcheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkillcheckApplication.class, args);
    }
}