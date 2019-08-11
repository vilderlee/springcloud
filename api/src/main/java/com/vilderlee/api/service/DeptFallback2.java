package com.vilderlee.api.service;

import com.vilderlee.api.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 功能描述:
 *
 * @package com.vilderlee.api.service
 * @auther vilderlee
 * @date 2019-08-10 19:37
 */
@Component
public class DeptFallback2 implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept(1,"123","123");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
