package com.lee.springcloud.mapper;

import com.lee.springcloud.entities.Dept;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface DeptMapper extends Mapper<Dept> {

}