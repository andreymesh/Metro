package com.cinimex.config;

import com.cinimex.entity.Station;
import com.cinimex.entity.Ticket;
import com.cinimex.entity.TravelCard;
import com.cinimex.entity.Trip;
import com.cinimex.mybatis.mapper.*;
import java.time.LocalDateTime;
import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@MapperScan(basePackages= "com.cinimex.mybatis.mapper")
@ComponentScan(basePackages = "com.cinimex.service")
public class DataConfig {
    private static final String PROPERTY_DB_DRIVER="com.mysql.jdbc.Driver";
    private static final String PROPERTY_URL="jdbc:mysql://localhost:3306/mydb";
    private static final String PROPERTY_USERNAME="root";
    private static final String PROPERTY_PASSWORD="1234";
    
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource datasource=new DriverManagerDataSource();
        datasource.setDriverClassName(PROPERTY_DB_DRIVER);
        datasource.setUrl(PROPERTY_URL);
        datasource.setUsername(PROPERTY_USERNAME);
        datasource.setPassword(PROPERTY_PASSWORD);
        return datasource;
    }
    
    @Autowired
    @Bean
    public SqlSessionFactory sqlSessionFactory (DataSource dataSource) throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }
}
