package com.xiang.springcloud.Service;

import com.xiang.pojo.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);

    Dept getDeptById(Long id);

    List<Dept> getAllDept();

    void updatePassWord();
}
