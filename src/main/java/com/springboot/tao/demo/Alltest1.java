package com.springboot.tao.demo;

/**
 * @author taozhiwei
 * @date 2020/10/26 14:45
 */
public class Alltest1 implements Cloneable{

    private Alltest3 alltest3;
    public String str = "tao1";

    public Alltest3 getAlltest3() {
        return alltest3;
    }

    public void setAlltest3(Alltest3 alltest3) {
        this.alltest3 = alltest3;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
