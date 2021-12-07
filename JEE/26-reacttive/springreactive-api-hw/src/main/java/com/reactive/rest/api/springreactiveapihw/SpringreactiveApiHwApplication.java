package com.reactive.rest.api.springreactiveapihw;

import com.reactive.rest.api.springreactiveapihw.utils.MyWebClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringreactiveApiHwApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringreactiveApiHwApplication.class, args);

		MyWebClient client = new MyWebClient();
		
		//System.out.println(client.getResult());
	
		client.doLogit();

		System.out.println("===============");

		client.doLogits();

		System.out.println("=================");

		client.fstudents();
	}

}
