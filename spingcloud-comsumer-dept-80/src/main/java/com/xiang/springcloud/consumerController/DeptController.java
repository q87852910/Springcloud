package com.xiang.springcloud.consumerController;

import com.xiang.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    RestTemplate restTemplate;

    private final static String URL="http://localhost:8001";

    @GetMapping("/consumer/dept/get/{id}")
    public Dept getDept(@PathVariable("id") Long id){
        return restTemplate.getForObject(URL+"/Dept/queryById?id="+id,Dept.class);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> getDeptAll(){
        return restTemplate.getForObject(URL+"/Dept/queryAll",List.class);
    }

    @PostMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){
        return restTemplate.postForObject(URL+"/Dept/addDept",dept,boolean.class);
    }
}
