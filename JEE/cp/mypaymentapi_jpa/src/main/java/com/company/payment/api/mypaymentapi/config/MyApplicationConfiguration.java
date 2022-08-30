package com.company.payment.api.mypaymentapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyApplicationConfiguration {
    
    @Value("${my.db.url}")
    private String dbUrl;

    @Value("${my.db.un}")
    private String dbPassword;

    @Value("${my.db.pwd}")
    private String dbUserName;

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbUserName() {
        return dbUserName;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    
}

