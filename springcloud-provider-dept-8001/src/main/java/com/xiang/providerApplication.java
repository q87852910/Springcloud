package com.xiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
//@EnableEurekaClient
public class providerApplication {
    public static void main(String[] args) {
       SpringApplication.run(providerApplication.class,args);
    }
}
