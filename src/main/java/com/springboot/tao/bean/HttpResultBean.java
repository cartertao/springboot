package com.springboot.tao.bean;

import lombok.Data;
import org.apache.http.Header;

/**
 * @author taozhiwei
 * @date 2020/7/27 17:05
 */
@Data
public class HttpResultBean {

    private String url;
    private Header[] headers;
    private String type;
    private String content;
    private String data;
    private String sendHeader;
    private int statusCode;
    private String phrase;
}
