package com.springboot.tao.services.impl;

import com.springboot.tao.bean.db.Student;
import com.springboot.tao.configer.dbConfig.ReadAnnotation;
import com.springboot.tao.configer.dbConfig.WriteAnnotation;
import com.springboot.tao.dao.StudentMapper;
import com.springboot.tao.services.StudentService;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * @author taozhiwei
 * @date 2020/7/22 17:08
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student selectById(int id) {
        return studentMapper.selectById(id);
    }

    @Override
    @Deprecated
    public Student selectByName(String name) {
        return studentMapper.selectByName(name);
    }

    @ReadAnnotation
    public Student useRead(int name) {
        return studentMapper.useRead(name);
    }

    @WriteAnnotation
    public int useWrite(int seq, int amount) {
        return studentMapper.useWrite(seq, amount);
    }

    /**
     * 多数据源问题，如果加了事务注解，则后面无论是否通过注解切换数据源都将失效
     * 数据源将会保持为处理事务注解当前时刻的数据源，如果需要切换则需要在加事务注解前切换数据源
     */
    @ReadAnnotation
    @Transactional
    public void testTransactionalMaster() {
        studentMapper.testTransactionalMaster(new Random().ints(0, 100).findFirst().getAsInt());
    }

    @ReadAnnotation
    @Transactional
    public void testTransactionalSlave() {
        studentMapper.testTransactionalSlave(new Random().ints(0, 100).findFirst().getAsInt());
    }

    @WriteAnnotation
    public void testTransactional(){
        //为了在同类中调用同类方法触发aop，需要获取代理对象而且还要加
        // @EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
        StudentServiceImpl o = (StudentServiceImpl)AopContext.currentProxy();
        o.testTransactionalMaster();
        //testTransactionalSlave();
    }
}
