package com.company.payments.api.paymentsapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.Setter;

@Configuration
@Getter
@Setter
@PropertySource(value = "classpath:db.properties")
public class MyDbConfig {
    @Value("${mysql.url}")
    private String dbUrl;

    @Value("${mysql.userid}")
    private String dbUserId;

    @Value("${mysql.password}")
    private String dbPassword;


}


// mysql.url=http://localhost:3306/dbname
// mysql.userid=root
// mysql.password=root
