package com.lingyue.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//SpringBoot项目启动入口类
@SpringBootApplication  //SpringBoot核心注解，主要用于开启spring核心配置
@MapperScan("com.lingyue.java.mapper")//开启扫描mapper包及其子目录
public class Application extends SpringBootServletInitializer {

    //springboot项目代码必须放到Application类所在的同级或下级目录

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
