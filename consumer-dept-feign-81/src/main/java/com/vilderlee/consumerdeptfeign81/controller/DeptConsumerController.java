package com.vilderlee.consumerdeptfeign81.controller;

import com.vilderlee.api.entities.Dept;
import com.vilderlee.api.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能描述:
 *
 * @package com.vilderlee.consumerdeptfeign81.controller
 * @auther vilderlee
 * @date 2019-08-10 18:37
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService clientService;

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id) {
        return clientService.get(id);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list() {
        return clientService.list();
    }
}
