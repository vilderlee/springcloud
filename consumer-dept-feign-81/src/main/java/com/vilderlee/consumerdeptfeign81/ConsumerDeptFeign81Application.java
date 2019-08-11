package com.vilderlee.consumerdeptfeign81;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.vilderlee.api.service")
public class ConsumerDeptFeign81Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDeptFeign81Application.class, args);
    }

}
