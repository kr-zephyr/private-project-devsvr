package com.sz21c.common.config.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@MapperScan({"com.sz21c.flightlogger.flightlog.dao"
        , "com.sz21c.flightlogger.settings.dao"})
@PropertySource("classpath:db.mysql.properties")
public class MyBatisConfig {

    @Autowired
    Environment environment;

    @Bean
    public DataSource dataSource() throws Exception {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUrl(environment.getProperty("db.mysql.url"));
        dataSource.setUsername(environment.getProperty("db.mysql.username"));
        dataSource.setPassword(environment.getProperty("db.mysql.password"));
        dataSource.setConnectionProperties(getDataSourceProperties());

        return dataSource;
    }

    private Properties getDataSourceProperties() {
        Properties properties = new Properties();
        properties.put("initialSize", environment.getProperty("db.mysql.initialSize"));
        properties.put("maxIdle", environment.getProperty("db.mysql.maxIdle"));
        properties.put("maxActive", environment.getProperty("db.mysql.maxActive"));
        properties.put("validationQuery", environment.getProperty("db.mysql.validationQuery"));
        properties.put("testWhileIdle", environment.getProperty("db.mysql.testWhileIdle"));
        properties.put("timeBetweenEvictionRunsMillis", environment.getProperty("db.mysql.timeBetweenEvictionRunsMillis"));

        return properties;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager() throws Exception{
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryForMyBatis(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean
    public SqlSession sqlSessionForMyBatis(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
