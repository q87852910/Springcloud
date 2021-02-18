package com.xiang.springcloud.dao;

import com.xiang.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository //被spring托管
public interface DeptDao {

     boolean addDept(Dept dept);

     Dept getDeptById(Long id);

     List<Dept> getAllDept();

    List<Map> updatePassWord();

    void updateInfo(List<Map<String, String>> list);

    void updateInfoBySing(Map<String, String> map);
}
