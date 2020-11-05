package com.springboot.tao.demo;

/**
 * @author taozhiwei
 * @date 2020/10/26 14:49
 */
public class Alltest3 {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.hashCode() + "[ Alltest3{" +
                "name='" + name + '\'' +
                '}';
    }
}
