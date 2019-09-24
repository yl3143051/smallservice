package com.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //EurekaService 启动类 接受其他其他微服务的注册
public class EurekaService7002_APP {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService7002_APP.class,args);
    }
}
