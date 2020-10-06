package com.springboot.tao.controller.spring;

import com.springboot.tao.bean.db.Student;
import com.springboot.tao.other.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taozhiwei
 * @date 2020/7/27 15:00
 */
@RestController
public class AsyncController {

    @Autowired
    AsyncTask asyncTask;

    @RequestMapping("/async/use")
    public Student useAsync(String a, String b) throws InterruptedException {
        Student student = new Student();
        asyncTask.useAsync(student);
        //等异步执行完成，也可以拿到异步处理后的值，因为同个对象内存地址是一样的
        //Thread.sleep(6000);
        System.out.println(a + b);
        return student;
    }

    @RequestMapping("/async/notUse")
    public Student notUseAsync(){
        Student student = new Student();
        asyncTask.notUseAsync(student);
        return student;
    }
}
