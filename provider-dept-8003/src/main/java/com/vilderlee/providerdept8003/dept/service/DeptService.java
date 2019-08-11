package com.vilderlee.providerdept8003.dept.service;


import com.vilderlee.api.entities.Dept;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-08-04
 */
public interface DeptService {
    boolean addDept(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
