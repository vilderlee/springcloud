package com.vilderlee.providerdept8001.dept.controller;


import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.vilderlee.api.entities.Dept;
import com.vilderlee.providerdept8001.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-08-04
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping(value = "/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping(value = "/get/{id}")
    public Dept get(@PathVariable long id){
        System.out.println("8001");
        Dept dept = deptService.get(id);
        if (dept==null){
            throw new RuntimeException("error");
        }
        return deptService.get(id);
    }

    @GetMapping(value = "/list")
    public List<Dept> list(){
        return deptService.list();
    }

    @Autowired
    private DiscoveryClient discoveryClient;
    @GetMapping(value = "/discovery")
    public String discovery(){
        List<String> services = discoveryClient.getServices();
        final String[] str = {""};

        services.forEach(s -> {
            List<ServiceInstance> instances = discoveryClient.getInstances(s);
            instances.forEach(instance->{
                str[0] = instance.getHost() + instance.getServiceId() + instance.getPort() + instance.getUri();
            });
        });


        return str[0];
    }
}
