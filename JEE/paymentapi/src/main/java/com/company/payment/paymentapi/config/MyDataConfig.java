package com.company.payment.paymentapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:data.properties")
public class MyDataConfig {

    @Value("${server.vendor}")
    private String serverVendor;

    public String getServerVendor() {
        return serverVendor;
    }

    public void setServerVendor(String serverVendor) {
        this.serverVendor = serverVendor;
    }

    
    
}
