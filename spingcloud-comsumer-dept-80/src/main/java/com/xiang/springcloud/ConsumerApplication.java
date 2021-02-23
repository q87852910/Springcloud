package com.xiang.springcloud;

import com.xiang.RibbonRule.RuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//指定负载哪个服务,指定rule配置类,不能再启动类当前目录以及子目录,否则会背所有ribbon客户端所共享
//@RibbonClient(name = "springcloud-provider-dept",configuration = RuleConfig.class)
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
