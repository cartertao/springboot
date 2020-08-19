package com.springboot.tao.dao;

import com.springboot.tao.bean.db.Student;
import org.apache.ibatis.annotations.Select;

/**
 * @author taozhiwei
 * @date 2020/7/22 16:40
 */
public interface StudentMapper {

    @Select("select * from student where id = #{id}")
    Student selectById(int id);

    //List<Student> selectByAge(int age);

    Student selectByName(String name);

    //int updateById(int id);

    //int deleteById(int id);


}
