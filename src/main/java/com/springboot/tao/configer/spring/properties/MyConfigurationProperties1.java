package com.springboot.tao.configer.spring.properties;

import com.springboot.tao.configer.dbConfig.DbTypeEnum;
import com.springboot.tao.configer.dbConfig.DynamicDataSource;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author taozhiwei
 * @date 2020/10/13 17:00
 */
@Configuration
public class MyConfigurationProperties1 {

    @ConfigurationProperties(prefix = "test1.mysql")
    @Bean
    public ConfigBean configBean(){
        return new ConfigBean();
    }

}
