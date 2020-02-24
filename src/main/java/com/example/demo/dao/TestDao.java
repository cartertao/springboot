package com.example.demo.dao;

import com.example.demo.bean.TestBean;

import java.util.List;

public interface TestDao {
    List<TestBean> get();

    void insert();
    int update();

    void call();
}
