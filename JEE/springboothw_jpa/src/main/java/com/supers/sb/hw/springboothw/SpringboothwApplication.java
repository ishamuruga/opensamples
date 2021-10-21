package com.supers.sb.hw.springboothw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.supers.sb.hw.springboothw.util.MathUtil;

@SpringBootApplication
@PropertySource(value = "classpath:data.properties")
public class SpringboothwApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboothwApplication.class, args);
	}
	
	
	/*
	 * <bean id="mutil" name="mutil" class="com.supers.sb.hw.springboothw.util.MathUtil" />
	 */

//	@Bean
//	public MathUtil mutil() {
//		return new MathUtil();
//	}

}
