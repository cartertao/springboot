package com.springboot.tao.dao;

import com.springboot.tao.bean.db.Sessions;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author taozhiwei
 * @date 2020/9/3 14:02
 */
public interface SessionsMapper {

    @Select("select * from sessions where id = #{id}")
    Sessions selectById(String id);

    @Update("update sessions set session = #{session} where id = #{id}")
    int updateById(Sessions sessions);

    @Delete("delete from sessions where id = #{id}")
    int deleteById(String id);

    @Insert("insert into sessions values(#{id}, #{session})")
    int insertSession(Sessions sessions);

    int insertSessions(List<Sessions> sessions);

    int updateSessions(Sessions sessions);
}
