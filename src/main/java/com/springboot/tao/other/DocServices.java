package com.springboot.tao.other;

import com.springboot.tao.bean.db.Student;
import com.springboot.tao.dao.StudentMapper;
import com.springboot.tao.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author taozhiwei
 * @date 2020/7/27 17:52
 */
public class DocServices implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    /**
     * 实现类注释
     * {@inheritDoc}
     */
    @Override
    public Student selectById(int id) {
        return studentMapper.selectById(id);
    }

    /**
     * 本类变量或者方法 / 本类导入的类或者变量
     * {@link #selectById(int)}
     * {@link #studentMapper}
     * {@link Student}
     * 同包下面其他类方法或者变量
     * {@link DocTest#mm()}
     * {@link DocTest#name}
     * 指定位置
     * {@link com.springboot.tao.controller.StudentController}
     */
    @Override
    @Deprecated
    public Student selectByName(String name) {
        return studentMapper.selectByName(name);
    }

    /**
     * 当前类
     * @see #studentMapper
     * @see #selectById(int)
     * 当前包
     * @see DocTest#mm()
     * @see DocTest#name
     * 指定位置
     * @see com.springboot.tao.controller.StudentController#selectById(int)
     */
    public void doc1(String name) { }

    /**
     * @deprecated 过期
     */
    @Deprecated
    public void doc2(String name) { }

    /**
     * {@linkplain}
     */
    @Deprecated
    public void doc4() { }
}
