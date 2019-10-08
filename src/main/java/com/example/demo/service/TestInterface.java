package com.example.demo.service;

import com.example.demo.bean.TestBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestInterface {
    List<TestBean> get();
}
