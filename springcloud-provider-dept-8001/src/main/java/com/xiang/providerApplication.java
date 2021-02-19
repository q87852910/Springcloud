package com.xiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class providerApplication {
    public static void main(String[] args) {
       SpringApplication.run(providerApplication.class,args);
    }
}
