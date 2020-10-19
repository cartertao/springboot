package com.springboot.tao.configer.dbConfig;

import lombok.Getter;
import lombok.Setter;

/**
 * @author taozhiwei
 * @date 2020/10/14 16:08
 */
public enum DbTypeEnum {
    MASTER("主库"),
    SLAVE("从库");

    @Getter
    private String value;
    DbTypeEnum(String value) {
        this.value = value;
    }
}
