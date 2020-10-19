package com.springboot.tao.configer.dbConfig;

import lombok.extern.java.Log;

/**
 * @author taozhiwei
 * @date 2020/10/14 16:11
 */
@Log
public class DynamicSwitchDBTypeUtil {

    /**
     * 用来存储数据源对象，
     * 如果里面是master，则代表是主，slave这是从
     * 默认从库
     */
    private static final ThreadLocal<DbTypeEnum> useDbType = new ThreadLocal<DbTypeEnum>(){
        @Override
        protected DbTypeEnum initialValue() {
            return DbTypeEnum.SLAVE;
        }
    };

    /**
     * 设置数据源类型
     */
    public static void setDbType(DbTypeEnum dbType){
        log.info("db use: " + dbType.getValue());
        useDbType.set(dbType);
    }

    /**
     * 设置为主库
     */
    public static void useMaterDb(){
        setDbType(DbTypeEnum.MASTER);
    }

    /**
     * 设置为从库
     */
    public static void useSlaveDb(){
        setDbType(DbTypeEnum.SLAVE);
    }

    /**
     * 移除当前使用的数据源
     */
    public static void removeDb(){
        useDbType.remove();
    }

    /**
     * 获取当前数据源类型
     */
    public static DbTypeEnum getCurrentDb(){
        return useDbType.get();
    }
}
