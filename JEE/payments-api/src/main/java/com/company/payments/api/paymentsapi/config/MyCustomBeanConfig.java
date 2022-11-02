package com.company.payments.api.paymentsapi.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.company.payments.api.paymentsapi.api.vhelper.CustomerApiViewHelper;

@Configuration
public class MyCustomBeanConfig {

    /**
     * <bean id="vhelper" class"...
     */
    @Bean
    @Scope("singleton")
    public CustomerApiViewHelper customerApiViewHelper() {
        return new CustomerApiViewHelper();
    }
}
