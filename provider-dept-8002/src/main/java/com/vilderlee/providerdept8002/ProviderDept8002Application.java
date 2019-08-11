package com.vilderlee.providerdept8002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.vilderlee.providerdept8002.dao")
@EnableEurekaClient
public class ProviderDept8002Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDept8002Application.class, args);
    }

}
