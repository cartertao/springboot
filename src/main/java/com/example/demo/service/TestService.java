package com.example.demo.service;

import com.example.demo.bean.TestBean;
import com.example.demo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class TestService implements TestInterface {

    @Autowired
    TestDao testDao;
    @Override
    public List<TestBean> get() {
        return testDao.get();
    }
}
