package com.crk.projectmanagement.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration
@MapperScan("com.example.demo.dao")
public class DataSourceConfigure {
    @Value("${jdbc.Url}")
    private String jdbcUrl;
    @Value("${jdbc.User}")
    private String user;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.jdbcDriver}")
    private String driverClass;
    @Bean("dataSource")
    public ComboPooledDataSource dataSourceConfiger() throws PropertyVetoException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl(jdbcUrl);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);
        comboPooledDataSource.setDriverClass(driverClass);
        comboPooledDataSource.setAutoCommitOnClose(true);
        return  comboPooledDataSource;
    }
}
