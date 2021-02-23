package com.xiang.springcloud.consumerController;

import com.xiang.Service.FeignClientService;
import com.xiang.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController {

    //注入FeignClientService
    @Autowired
    FeignClientService feignClientService;

    @GetMapping("/consumer/dept/get/{id}")
    public Dept getDept(@PathVariable("id") Long id){
        return feignClientService.getDeptById(id);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> getDeptAll(){

        return feignClientService.getAllDept1();
    }

    @PostMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){

        return feignClientService.addDept(dept);
    }
}
