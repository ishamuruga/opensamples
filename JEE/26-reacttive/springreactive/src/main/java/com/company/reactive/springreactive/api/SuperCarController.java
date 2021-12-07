package com.company.reactive.springreactive.api;

import com.company.reactive.springreactive.service.SuperCarManager;

import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class SuperCarController {
    private SuperCarManager service;

    public Flux getUsers(){
        return service.getSuperCars();
    }
}
