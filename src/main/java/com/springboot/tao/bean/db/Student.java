package com.springboot.tao.bean.db;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author taozhiwei
 * @date 2020/7/22 16:47
 */
@Data
@ApiModel(value="基础返回类",description="基础返回类")
public class Student {

    /**
     * range[1, infinity] >=1
     */
    @ApiModelProperty(value = "id",dataType = "int", required = true, allowableValues = "range[1,5]", example = "8")
    private int id;
    @ApiModelProperty(value = "name",dataType = "String", required = true, allowableValues = "tao,zhi,wei")
    private String name;
    private int age;
}
