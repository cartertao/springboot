package com.springboot.tao.configer.dbConfig;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author taozhiwei
 * @date 2020/10/14 16:34
 */
@Configuration
public class DbSourceConfig {

    /**
     * master 配置
     * @see com.springboot.tao.configer.spring.properties.MyConfigurationProperties1
     */
    @Bean
    @ConfigurationProperties("spring.datasource.master")
    public DataSource masterDataSource(){
        return new DruidDataSource();
    }

    /**
     * slave 配置
     */
    @Bean
    @ConfigurationProperties("spring.datasource.slave")
    public DataSource slaveDataSource(){
        return new DruidDataSource();
    }

    @Bean
    public DataSource dynamicDataSource(@Qualifier("masterDataSource") DataSource master,
                                       @Qualifier("slaveDataSource") DataSource slave){
        //用来保存主从数据源
        Map<Object, Object> allDataSource = new HashMap<>();
        allDataSource.put(DbTypeEnum.MASTER, master);
        allDataSource.put(DbTypeEnum.SLAVE, slave);

        //使用我们的动态数据源类
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        //绑定所有数据源
        dynamicDataSource.setTargetDataSources(allDataSource);
        //设置默认数据源
        dynamicDataSource.setDefaultTargetDataSource(slave);
        return dynamicDataSource;
    }

    /**
     * 根据数据源创建SqlSessionFactory
     * @MapperScan("com.springboot.tao.dao")
     * @see com.springboot.tao.configer.MybatisConfig
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dynamicDataSource") DataSource dataSource,
                                               @Value("${mybatis.typeAliasesPackage}") String typeAliasesPackage,
                                               @Value("${mybatis.mapperLocations}") String mapperLocations) throws Exception {

        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);// 指定数据源(这个必须有，否则报错)

        // 下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
        factoryBean.setTypeAliasesPackage(typeAliasesPackage);// 指定基包
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));

        return factoryBean.getObject();

    }

    /**
     * 配置事务管理器
     */
    @Bean
    public DataSourceTransactionManager transactionManager(@Qualifier("dynamicDataSource") DataSource dataSource) throws Exception {
        return new DataSourceTransactionManager(dataSource);
    }
}
