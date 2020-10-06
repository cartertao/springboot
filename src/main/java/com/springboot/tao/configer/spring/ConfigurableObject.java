package com.springboot.tao.configer.spring;

import com.springboot.tao.bean.db.Student;
import com.springboot.tao.services.StudentService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * @author taozhiwei
 * @date 2020/7/27 15:34
 * 我们直接new Object()是无法被spring管理的，spring也无法注入其他bean进入该对象
 * 如果配置注解Configurable，当我们new出来的对象，spring可以帮我们赋值spring ioc中的bean到该对象的属性中
 */
@Configurable(autowire= Autowire.BY_NAME, preConstruction = true)
public class ConfigurableObject {

    @Autowired
    @Getter
    @Setter
    private StudentService studentService;

    public Student selectByName(String name){
        return studentService.selectByName(name);
    }
}
