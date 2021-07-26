package com.springboot.tao.demo.jdk.algorithm.picture;


import lombok.Data;

/**
 * @Author: carter
 * @Date: 2021/7/26
 */
@Data
public class PictureBean {

    /**
     * 路径权重
     */
    private int wight;

    /**
     * 下一个节点id
     */
    int id ;

    public PictureBean(int wight, int id) {
        this.wight = wight;
        this.id = id;
    }
}
