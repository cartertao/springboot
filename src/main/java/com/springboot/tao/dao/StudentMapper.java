package com.springboot.tao.dao;

import com.springboot.tao.bean.db.Student;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author taozhiwei
 * @date 2020/7/22 16:40
 */
public interface StudentMapper {

    @Select("select * from student where id = #{id}")
    Student selectById(int id);

    //List<Student> selectByAge(int age);

    Student selectByName(String name);

    @Select("select * from student where id = #{id}")
    Student useRead(int id);

    @Update("update cord set amount = #{amount} where seq = #{seq}")
    int useWrite(int seq, int amount);

    @Update("update cord set amount = #{amount} where seq = 1")
    int testTransactionalMaster(int amount);

    @Update("update student set age = #{age} where id = 1")
    void testTransactionalSlave(int age);

    //int updateById(int id);

    //int deleteById(int id);


}
