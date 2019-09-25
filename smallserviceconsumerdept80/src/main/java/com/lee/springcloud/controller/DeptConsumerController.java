package com.lee.springcloud.controller;

import com.lee.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/dept/consumer")
public class DeptConsumerController {

//    public static String REST_URL = "http://localhost:8001";
    public static String REST_URL = "http://SMALLSERVICE-SPRINGCLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/list")
    public List<Dept> getAllList() {
        return restTemplate.getForObject(REST_URL + "/dept/list", List.class);
    }
}
