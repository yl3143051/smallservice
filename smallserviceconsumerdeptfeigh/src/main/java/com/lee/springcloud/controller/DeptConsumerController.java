package com.lee.springcloud.controller;

import com.lee.springcloud.entities.Dept;
import com.lee.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/dept/consumer")
public class DeptConsumerController {

    @Autowired
    private DeptClientService service;


    @RequestMapping(value = "/list")
    public List<Dept> list()
    {
        return this.service.list();
    }


}
