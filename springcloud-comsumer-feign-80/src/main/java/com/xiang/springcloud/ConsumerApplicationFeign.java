package com.xiang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.xiang.Service"}) //开启feign客户端注解,需要扫描哪些包下的FeignClient需要被扫到
public class ConsumerApplicationFeign {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicationFeign.class,args);
    }
}
