package com.company.payment.api.mypaymentapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:aws.properties")
public class MyAwsConfiguration {
    @Value("${my.aws.url}")
    private String url;

    @Value("${my.aws.token}")
    private String token;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    
}

// my.aws.url=http://aws.amazon.co.in/s3
// my.aws.un=mycompany
// my.aws.token=sgsfjsfjslfsdlfhsdlfhsdlfds
