package com.xiang.Service;

import com.xiang.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Configuration
@FeignClient(name="springcloud-provider-dept")
//name相当于指定服务名,即ip+port ,path指定请求路劲-即服务的controller路劲,具体方法对应具体的请求地址
public interface FeignClientService {
    @PostMapping("/Dept/addDept")
    boolean addDept(Dept dept);

    @GetMapping("/Dept/queryById")
    Dept getDeptById(@RequestParam(name="id") Long id);

    @GetMapping("/Dept/queryAll")
    List<Dept> getAllDept1();
}
