package com.vilderlee.api.service;

import com.vilderlee.api.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 功能描述:
 *
 * @package com.vilderlee.api.service
 * @auther vilderlee
 * @date 2019-08-10 18:33
 */

//@FeignClient(value = "provider-dept", fallbackFactory = DeptFallback2.class)
@FeignClient(value = "provider-dept", fallback = DeptFallback.class)

public interface DeptClientService {
    @PostMapping(value = "/dept/add")
    boolean addDept(Dept dept);

    @GetMapping(value = "/dept/get/ {id}")
    Dept get(@PathVariable Long id);

    @GetMapping(value = "/dept/list")
    List<Dept> list();
}
