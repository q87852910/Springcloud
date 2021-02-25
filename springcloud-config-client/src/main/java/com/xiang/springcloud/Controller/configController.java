package com.xiang.springcloud.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class configController {
    @Value("${spring.application.name}")
    String applicationName;

    @RequestMapping("/config")
    public String config(){
        return applicationName;
    }
}
