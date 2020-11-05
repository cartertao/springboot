package com.springboot.tao.demo.jdk.clone;

import lombok.Data;

/**
 * @author taozhiwei
 * @date 2020/10/26 16:54
 */
@Data
public class CloneB  implements Cloneable{

    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
