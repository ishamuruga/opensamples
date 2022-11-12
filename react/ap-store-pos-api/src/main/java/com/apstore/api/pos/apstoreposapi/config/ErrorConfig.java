package com.apstore.api.pos.apstoreposapi.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.Setter;

@Configuration
@PropertySource(value = "classpath:error.properties")
@ConfigurationProperties(prefix = "pos")
@Getter
@Setter
public class ErrorConfig {
    private Map<String,String> errMap;
}
