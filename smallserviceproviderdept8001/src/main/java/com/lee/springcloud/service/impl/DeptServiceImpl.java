package com.lee.springcloud.service.impl;

import com.lee.springcloud.entities.Dept;
import com.lee.springcloud.mapper.DeptMapper;
import com.lee.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> findAll() {
        return deptMapper.selectAll();
    }
}
