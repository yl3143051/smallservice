package com.lee.springcloud.service;

import com.lee.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {

        return new DeptClientService() {
            @Override
            public List<Dept> list() {
                Dept dept = new Dept();
                dept.setDbSource("没有找到数据2");
                dept.setDeptName("没有找到数据2");
                return Arrays.asList(dept);
            }
        };
    }
}
