package com.xiang.Service;

import com.xiang.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@FeignClient(name="springcloud-provider-dept",path = "")
//name相当于指定服务名,即ip+port ,path指定请求路劲-即服务的controller路劲,具体方法对应具体的请求地址
public interface FeignClientService {
    @PostMapping("/consumer/dept/add")
    boolean addDept(Dept dept);

    @GetMapping("/consumer/dept/get/{id}")
    Dept getDeptById(Long id);

    @GetMapping("/consumer/dept/list")
    List<Dept> getAllDept();
}
