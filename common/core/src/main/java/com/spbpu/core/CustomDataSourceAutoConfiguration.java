package com.spbpu.core;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@AutoConfiguration(after = DataSourceAutoConfiguration.class)
@EnableConfigurationProperties
public class CustomDataSourceAutoConfiguration {

    @Bean
    @ConfigurationProperties("spring.datasource.project")
    public DataSource projectDataSource() {
        return DataSourceBuilder.create().build();
    }
}
