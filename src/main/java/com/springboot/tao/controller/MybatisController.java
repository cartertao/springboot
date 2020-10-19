package com.springboot.tao.controller;

import com.springboot.tao.bean.db.Student;
import com.springboot.tao.configer.spring.ConfigurableObject;
import com.springboot.tao.services.impl.StudentServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taozhiwei
 * @date 2020/7/22 17:06
 */
@RestController
@RequestMapping("/mybatis")
public class MybatisController {

    @Autowired
    StudentServiceImpl mybatisTest;

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public Student selectById(@Param("id")int id){
        return mybatisTest.selectById(id);
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public Student selectById(@Param("name")String name){
        return mybatisTest.selectByName(name);
    }

    @RequestMapping(value = "/configurable/name", method = RequestMethod.GET)
    public Student configurableSelectById(@Param("name")String name){
        ConfigurableObject configurableObject = new ConfigurableObject();
        return configurableObject.selectByName(name);
    }

    @GetMapping("/read/id")
    public Student useRead(@Param("id")int id){
        return mybatisTest.useRead(id);
    }

    @GetMapping("/write/id")
    public int useWrite(@Param("seq")int seq, @Param("amount")int amount){
        return mybatisTest.useWrite(seq, amount);
    }

    /**
     * 测试事务
     * 主更新，从更新，异常
     */

    @GetMapping("/transaction")
    public void testTransactional(){
        mybatisTest.testTransactional();
    }
}
