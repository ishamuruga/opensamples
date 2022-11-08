package com.company.payments.api.paymentsapi.config;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix = "payapi")
@PropertySource(value = "classpath:special.properties")
@Getter
@Setter
public class MySpecialConfig {
    
    //@Value("${names}")
    private List<String> names;

    private Map<String,String> errMap;
}
