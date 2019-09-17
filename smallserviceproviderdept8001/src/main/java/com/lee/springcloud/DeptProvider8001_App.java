package com.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.lee.springcloud.mapper")
public class DeptProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class, args);
    }
}
