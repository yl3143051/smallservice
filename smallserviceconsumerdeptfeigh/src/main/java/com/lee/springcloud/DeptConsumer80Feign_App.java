package com.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.lee.springcloud.mapper")
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.lee.springcloud"})
//@ComponentScan("com.lee.springcloud")
public class DeptConsumer80Feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80Feign_App.class, args);
    }
}
