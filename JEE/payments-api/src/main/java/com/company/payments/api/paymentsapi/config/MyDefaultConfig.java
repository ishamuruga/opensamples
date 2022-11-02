package com.company.payments.api.paymentsapi.config;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@Getter
@Setter
public class MyDefaultConfig {
    
    @Value("${aws.url}")
    private String awsUrl;

    @Value("${aws.userid}")
    private String awsUserId;

    @Value("${aws.password}")
    private String awsPassword;
}


// aws.url=http://aws-console.com
// aws.userid=abcd
// aws.password=abcd@123