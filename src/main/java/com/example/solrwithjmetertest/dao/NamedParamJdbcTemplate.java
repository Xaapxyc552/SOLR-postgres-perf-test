package com.example.solrwithjmetertest.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class NamedParamJdbcTemplate {
    private final Logger LOG = LogManager.getLogger(NamedParamJdbcTemplate.class);

    @Resource(name = "basicDataSource")
    private DataSource dataSource;

    @Bean(name = "myNamParamJdbcTemp")
    public NamedParameterJdbcTemplate createJdbcTemplate() {
        return new NamedParameterJdbcTemplate(dataSource);
    }
}
