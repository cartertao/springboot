package com.springboot.tao.demo.httpTest.bean;

import lombok.Data;

/**
 * @author taozhiwei
 * @date 2020/8/19 18:31
 */
@Data
public class MemberSearchResult {

    private String name;
    private String level;
    private int money;
    /**
     * 人物评分
     */
    private String score;
}
