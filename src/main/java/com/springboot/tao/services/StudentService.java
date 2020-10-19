package com.springboot.tao.services;

import com.springboot.tao.bean.db.Student;

/**
 * @author taozhiwei
 * @date 2020/7/22 17:07
 */
public interface StudentService {

    /**
     * 通过 @Select 查询
     * @param id
     * @return
     */
    Student selectById(int id);

    /**
     *
     * @param name
     * @return
     */
    Student selectByName(String name);

}
