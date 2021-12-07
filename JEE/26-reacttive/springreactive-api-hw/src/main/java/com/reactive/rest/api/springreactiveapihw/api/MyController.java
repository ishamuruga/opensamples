package com.reactive.rest.api.springreactiveapihw.api;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import com.reactive.rest.api.springreactiveapihw.model.AddStudent;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api")
public class MyController extends BaseController {

    @GetMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<AddStudent> getNewStudent() {
        System.out.println("Controller being called.................");
        return Mono.just(new AddStudent(1, "Rajinikanth", "Anna Univ"));
    }

    @GetMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<List<AddStudent>> getAllStudents() {
        System.out.println("Controller being called.................");

        List lstStu = new ArrayList<>();
        lstStu.add(new AddStudent(1, "Rajinikanth1", "Anna Univ1"));
        lstStu.add(new AddStudent(2, "Rajinikanth2", "Anna Univ2"));
        lstStu.add(new AddStudent(3, "Rajinikanth3", "Anna Univ3"));

        return Mono.just(lstStu);
    }

    @GetMapping(value = "/fstudents", produces = MediaType.APPLICATION_JSON_VALUE)
    private Flux<AddStudent> getAllEmployees() {
        System.out.println("===================>>>FSStudents");
        return Flux.fromIterable(this.getTestsStudets())
                        .log().delayElements(Duration.ofSeconds(1));
    }
}
