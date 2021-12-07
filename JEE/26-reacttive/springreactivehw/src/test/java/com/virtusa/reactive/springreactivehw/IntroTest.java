package com.company.reactive.springreactivehw;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import reactor.core.publisher.Flux;

@SpringBootTest
public class IntroTest {
    @Test
    public void testIntro1() {
        System.out.println("====================IIntro 1");
        // simple list
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        // creating stream from list
        Stream<Integer> intStream = intList.stream().filter(i -> i > 2).map(i -> i * i);
        List<Integer> list1 = intStream.collect(Collectors.toList());
        // print
        System.out.println(list1);

        // List<Integer> list2 = intStream.collect(Collectors.toList());
    }

    @Test
    public void testIntro2() {
        System.out.println("====================IIntro 2");
        Flux.empty().subscribe(i -> System.out.println("#Received : " + i));
        Flux.just(1).subscribe(i -> System.out.println("##Received : " + i));
    }

    @Test
    public void testIntro3() {
        System.out.println("====================IIntro 3");
        Flux<Integer> flux = Flux.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Observer 1
        flux.subscribe(i -> System.out.println("Observer-1 : " + i));
        // Observer 2
        flux.subscribe(i -> System.out.println("Observer-2 : " + i));
    }

    //@Test
    public void testIntro4() {
        System.out.println("====================IIntro 4");
        System.out.println("Starts");

        // flux emits one element per second
        Flux<Character> flux = Flux.just('a', 'b', 'c', 'd').delayElements(Duration.ofSeconds(1));
        // Observer 1 - takes 500ms to process
        flux.map(Character::toUpperCase).subscribe(i -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Observer-1 : " + i);
        });
        // Observer 2 - process immediately
        flux.subscribe(i -> System.out.println("Observer-2 : " + i));

        System.out.println("Ends");
    }

    //@Test
    public void testIntro5() {
        System.out.println("====================IIntro 5");
        Flux<Character> flux = Flux.just('f', 'h', 'y', 'j').log().delayElements(Duration.ofSeconds(5));
    }

    @Test
    public void testIntro6() {
        System.out.println("====================IIntro 6");
        Flux.just(1, 2, 3)
                .map(i -> 10 / i)
                .subscribe(
                    i -> System.out.println("Received :: " + i),
                    err -> System.out.println("Error :: " + err), 
                    () -> System.out.println("Successfully completed"));
    }

    @Test
    public void testIntro7() {
        System.out.println("====================IIntro 7");
        Flux.just(1,2,3)
            .map(i -> i / (i-2))
             .subscribe(
                    i -> System.out.println("Received :: " + i),
                    err -> System.out.println("Error :: " + err),
                    () -> System.out.println("Successfully completed")); 
    }

    @Test
    public void testIntro8() {
        System.out.println("====================IIntro 8");
        String[] arr = {"Hi", "Hello", "How are you"};

        Flux.fromArray(arr)
            .filter(s -> s.length() > 2)
            .subscribe(i -> System.out.println("Received : " + i));

        List<String> list = Arrays.asList("vins", "guru");
        Flux<String> stringFlux = Flux.fromIterable(list)
                        .map(String::toUpperCase);

        List<String> lis1t = Arrays.asList("vins", "guru");
        Flux<String> stringFlux2 = Flux.fromStream(list.stream())
                                .map(String::toUpperCase);
    }
}
