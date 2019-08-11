package com.vilderlee.consumerdeptfeign81.controller;

import com.vilderlee.api.service.DeptFallback;
import com.vilderlee.api.service.DeptFallback2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述:
 *
 * @package com.vilderlee.consumerdeptfeign81.controller
 * @auther vilderlee
 * @date 2019-08-10 20:27
 */
@Configuration
public class Config {

//    @Bean
//    public DeptFallback2 deptFallback2(){
//        return new DeptFallback2();
//    }

    @Bean
    public DeptFallback deptFallback(){
        return new DeptFallback();
    }
}
