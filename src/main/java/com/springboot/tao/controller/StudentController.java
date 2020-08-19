package com.springboot.tao.controller;

import com.springboot.tao.bean.db.Student;
import com.springboot.tao.configer.ConfigurableObject;
import com.springboot.tao.services.impl.StudentServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taozhiwei
 * @date 2020/7/22 17:06
 */
@RestController
public class StudentController {

    @Autowired
    StudentServiceImpl mybatisTest;

    @RequestMapping("/mybatis/id")
    public Student selectById(@Param("id")int id){
        return mybatisTest.selectById(id);
    }

    @RequestMapping("/mybatis/name")
    public Student selectById(@Param("name")String name){
        return mybatisTest.selectByName(name);
    }

    @RequestMapping("/configurable/name")
    public Student configurableSelectById(@Param("name")String name){
        ConfigurableObject configurableObject = new ConfigurableObject();
        return configurableObject.selectByName(name);
    }
}
