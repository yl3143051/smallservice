package com.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.lee.springcloud.mapper")
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class DeptProviderHystrix8001_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix8001_App.class, args);
    }
}
