package com.company.payment.api.mypaymentapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan(basePackages = "com.company.company2")
// @ComponentScan(basePackages = "com.company.payment.api.mypaymentapi")
@EnableAutoConfiguration(exclude=HibernateJpaAutoConfiguration.class)
public class MypaymentapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(MypaymentapiApplication.class, args);
	}
}
