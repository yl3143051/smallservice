package com.lee.springcloud.service;

import com.lee.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> findAll();
}
