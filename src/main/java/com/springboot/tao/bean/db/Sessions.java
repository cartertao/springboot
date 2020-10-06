package com.springboot.tao.bean.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author taozhiwei
 * @date 2020/9/3 14:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sessions implements Serializable {
    public Sessions(String id, String session) {
        this.id = id;
        this.session = session;
    }

    private String id;
    private String session;

    private List<Sessions> sessionList;
}
