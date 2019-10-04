package com.lee.springcloud.controller;

import com.lee.springcloud.entities.Dept;
import com.lee.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Object findAll() {
        int i = new Random().nextInt(4) + 1;
        if (i == 4) {
            throw new RuntimeException();
        }
        return deptService.findAll();
    }

    public List<Dept> processHystrix_Get() {
        Dept dept = new Dept();
        dept.setDbSource("没有找到数据");
        dept.setDeptName("没有找到数据");
        return Arrays.asList(dept);
    }


}
