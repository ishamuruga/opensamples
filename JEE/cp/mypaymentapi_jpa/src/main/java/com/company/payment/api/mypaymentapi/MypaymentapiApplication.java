package com.company.payment.api.mypaymentapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:db.properties")
public class MypaymentapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(MypaymentapiApplication.class, args);
	}
}
