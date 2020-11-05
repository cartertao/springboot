package com.springboot.tao.demo.jdk.clone;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * @author taozhiwei
 * @date 2020/10/26 16:54
 */
@Data
public class CloneA implements Cloneable{

    private String sex = "男人";
    private int age = 18;
    private Integer id = new Integer(1);
    private CloneB cloneB;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();

        //CloneB CloneB = (CloneB)this.cloneB.clone();
        //this.cloneB = cloneB;
        return clone;
    }
}
