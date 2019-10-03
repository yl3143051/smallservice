package com.lee.springcloud.service;

import com.lee.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "SMALLSERVICE-SPRINGCLOUD-DEPT")
public interface DeptClientService {

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    List<Dept> list();


}
