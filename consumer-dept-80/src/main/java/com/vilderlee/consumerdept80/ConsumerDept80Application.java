package com.vilderlee.consumerdept80;

import com.vilderlee.rule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "provider-dept", configuration = MyselfRule.class)
public class ConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept80Application.class, args);
    }

}
