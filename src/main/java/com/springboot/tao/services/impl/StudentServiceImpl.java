package com.springboot.tao.services.impl;

import com.springboot.tao.bean.db.Student;
import com.springboot.tao.dao.StudentMapper;
import com.springboot.tao.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
