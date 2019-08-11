package com.vilderlee.consumerdept80.controller;

import com.vilderlee.api.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述:
 *
 * @package com.vilderlee.consumerdept80.controller
 * @auther vilderlee
 * @date 2019-08-05 23:23
 */
@RestController
public class DeptController_Consumer {

    private static final String HTTP = "http://provider-dept";
    //    private static final String HTTP = "http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/dept/get/{id}")
    public Dept getDept(@PathVariable int id) {
        return restTemplate.getForObject(HTTP + "/dept/get/" + id, Dept.class);
    }
}
