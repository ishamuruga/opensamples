package com.company.reactive.springreactivehw;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class MonoTest {
    //@Test
    public void testMono1() {
        System.out.println("====================1");
        Mono<String> mono = Mono.empty();
    }

    //@Test
    public void testMonoX() {
        Mono<Integer> monoStream = Mono.just(10);
        monoStream.subscribe(val -> {
            System.out.println(val + 100);
        });
    }

    //@Test
    public void testMono2() {
        Mono<String> mono = Mono.just("Spring");
        mono.subscribe(System.out::println);
    }

    //@Test
    public void testMono3() {
        Mono<Integer> mono = Mono.just(10);
        mono.subscribe(System.out::println);
    }

    //@Test
    public void testMono4() {
        System.out.println("TestMono4==================");
        Mono<String> mono = Mono.error(new RuntimeException("Exception occurred"));
        // mono.subscribe(System.out::println);

    }

    //@Test
    public void testMono5() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@st");
        Mono<String> mono = Mono.just("Spring");
        StepVerifier.create(mono.log()).expectNext("Spring").verifyComplete();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@end");
    }

    //@Test
    public void testMono6() {
        Mono<String> mono = Mono.error(new RuntimeException("Exception occurred"));
        StepVerifier.create(mono.log()).expectError(RuntimeException.class).verify();
        // Another approach

        StepVerifier.create(Mono.error(new RuntimeException("Exception")).log()).expectError(RuntimeException.class)
                .verify();
    }

     //@Test
     public void testMono7() {
        Mono<String> monoMap = Mono.just("James").map(s -> s.toLowerCase());
        StepVerifier.create(monoMap).expectNext("james").verifyComplete();
    }

    @BeforeEach
    public void logBefore(){
        System.out.println("==@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@st");
    }

    @AfterEach
    public void logAfter(){
        System.out.println("==@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@st");
    }
}
