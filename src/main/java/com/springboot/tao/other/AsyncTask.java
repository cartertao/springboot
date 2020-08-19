package com.springboot.tao.other;

import com.springboot.tao.bean.db.Student;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author taozhiwei
 * @date 2020/7/27 14:57
 */
@Component
public class AsyncTask {

    @Async
    public Student useAsync(Student student){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        student.setName("use async");
        return student;
    }

    public Student notUseAsync(Student student){
        System.out.println("not use async");
        student.setName("not use async");
        return student;
    }
}
