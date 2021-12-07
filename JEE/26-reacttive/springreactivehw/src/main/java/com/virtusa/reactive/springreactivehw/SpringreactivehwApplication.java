package com.company.reactive.springreactivehw;

import com.company.reactive.springreactivehw.client.GreetingWebClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class SpringreactivehwApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringreactivehwApplication.class, args);

		//GreetingWebClient gwc = new GreetingWebClient();
		//System.out.println(gwc.getResult());

	//	example1();
	}

	// private static void example1() {
	// 	Mono<Integer> monoStream = Mono.just(10);
	// 	monoStream.subscribe(val -> {
	// 		System.out.println(val+100);
	// 	});
	// }

}
