package com.vilderlee.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 功能描述:
 *
 * @author vilderlee
 * @package com.vilderlee.api.entities
 * @auther vilderlee
 * @date 2019-08-04 21:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private static final long serialVersionUID = -8131795992689306623L;
    private long deptno;
    private String dname;
    private String db_source;


}
