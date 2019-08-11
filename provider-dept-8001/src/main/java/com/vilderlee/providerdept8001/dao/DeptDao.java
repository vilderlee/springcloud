package com.vilderlee.providerdept8001.dao;

import com.vilderlee.api.entities.Dept;

import java.util.List;

/**
 * 功能描述:
 *
 * @package com.vilderlee.providerdept8001.dao
 * @auther vilderlee
 * @date 2019-08-04 22:23
 */
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
