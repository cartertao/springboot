package com.springboot.tao.bean.db;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author taozhiwei
 * @date 2020/7/22 16:47
 */
@Data
@ApiModel(value="基础返回类",description="基础返回类")
public class Student implements Serializable {
    public Student() {
    }
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * range[1, infinity] >=1
     */
    @ApiModelProperty(value = "id",dataType = "int", required = true, allowableValues = "range[1,5]", example = "8")
    private int id;
    @ApiModelProperty(value = "name",dataType = "String", required = true, allowableValues = "tao,zhi,wei")
    private String name;
    private int age;
}
