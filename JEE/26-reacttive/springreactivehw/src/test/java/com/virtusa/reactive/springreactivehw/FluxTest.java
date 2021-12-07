package com.company.reactive.springreactivehw;

import java.time.Duration;
import java.util.Observable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
public class FluxTest {

    // @Test
    void testFlux4() {
        Flux<String> source = Flux.just("John", "Monica", "Mark", "Cloe", "Frank", "Casper", "Olivia", "Emily", "Cate")
                .filter(name -> name.length() == 4).map(String::toUpperCase).map((x) -> {
                    System.out.println("====>" + x);
                    return x;
                });
        StepVerifier.create(source.log()).expectNextCount(4).verifyComplete();

        StepVerifier.create(source).expectNext("JOHN").expectNextMatches(name -> name.startsWith("MA"))
                .expectNext("CLOE", "CATE").expectComplete().verify();
    }

    // @Test
    void testFlux1() {
        // create-Prepare a new StepVerifier in an uncontrolled environment:
        // Step.thenAwait will block in real time.Each verify() will fully (re)play the
        // scenario.
        // expectNext - Expect the next element received to be equal to the given value.
        // verfyComplete - Trigger the verification, expecting a completion signalas
        // terminal event.
        Flux<String> flux = Flux.just("Spring MVC", "Spring Boot", "Spring Web");

        StepVerifier.create(flux.log()).expectNext("Spring MVC").expectNext("Spring Boot").expectNext("Spring Web")
                .verifyComplete();

    }

    // @Test
    void testFlux2() {
        // expectNextCount-Expect to received count elements, starting from the
        // previousexpectation or onSubscribe.
        Flux<String> flux = Flux.just("Spring MVC1", "Spring Boot2", "Spring Web3");
        StepVerifier.create(flux.log()).expectNextCount(3).verifyComplete();
    }

    // @Test
    void testFlux3() {
        // expectError -Expect an error of the specified type.
        // verify -Verify the signals received by this subscriber.
        Flux<String> flux = Flux.just("Spring MVC3", "Spring Boot3", "Spring Web3")
                .concatWith(Flux.error(new RuntimeException("Exception Occurred")));
        StepVerifier.create(flux.log()).expectNext("Spring MVC3").expectNext("Spring Boot3").expectNext("Spring Web3")
                .expectError(RuntimeException.class).verify();
    }

    // @Test
    void testFlux5() {
        Flux<String> fluxMapFilter = Flux.just("Joel", "Kyle").filter(s -> s.toUpperCase().startsWith("K"))
                .map(s -> s.toLowerCase());
        StepVerifier.create(fluxMapFilter).expectNext("kyle").verifyComplete();
    }

    //@Test
    void testFluxZipping6() {
        System.out.println("ZIIPPING.......................");
        Flux<String> titles = Flux.just("Mr.", "Mrs.");
        Flux<String> firstNames = Flux.just("John", "Jane");
        Flux<String> lastNames = Flux.just("Doe", "Blake");

        Flux<String> names = Flux.zip(titles, firstNames, lastNames)
                .map(t -> t.getT1() + " " + t.getT2() + " " + t.getT3());

        StepVerifier.create(names.log()).expectNextCount(2).verifyComplete();
        // StepVerifier.create(names).expectNext("Mr. John Doe", "Mrs. Jane
        // Blake").verifyComplete();

        // Flux<Long> delay = Flux.interval(Duration.ofMillis(5));
        // Flux<String> firstNamesWithDelay = firstNames.zipWith(delay, (s, l) -> s);

        // Flux<String> namesWithDelay = Flux
        // .zip(titles, firstNamesWithDelay, lastNames)
        // .map(t -> t.getT1() + " " + t.getT2() + " " + t.getT3());

        // StepVerifier.create(namesWithDelay).expectNext("Mr. John Doe", "Mrs. Jane
        // Blake").verifyComplete();
    }

    //@Test
    void testFlux7() {
        Stream<Integer> stream1 = Stream.of(1, 3, 5);
        Stream<Integer> stream2 = Stream.of(2, 4, 6);
        Stream<Integer> stream3 = Stream.of(18, 15, 36);

        Stream<Integer> resultingStream = Stream.concat(Stream.concat(stream1, stream2), stream3);

        resultingStream.collect(Collectors.toList()).forEach(System.out::println);
    }

    @BeforeEach
    public void logBefore() {
        System.out.println("==########################@st");
    }

    @AfterEach
    public void logAfter() {
        System.out.println("==#########################end");
    }
}
