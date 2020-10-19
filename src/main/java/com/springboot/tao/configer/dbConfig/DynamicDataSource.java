package com.springboot.tao.configer.dbConfig;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author taozhiwei
 * @date 2020/10/14 16:31
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicSwitchDBTypeUtil.getCurrentDb();
    }
}
