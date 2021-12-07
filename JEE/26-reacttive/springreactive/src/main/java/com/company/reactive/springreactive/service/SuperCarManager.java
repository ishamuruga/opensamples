package com.company.reactive.springreactive.service;

import java.util.List;
import java.util.Optional;

import com.company.reactive.springreactive.entity.SuperCar;

import reactor.core.publisher.Flux;

public interface SuperCarManager {
    public Flux getSuperCars();

    public Optional<SuperCar> findById(SuperCar sc);

    public void save(SuperCar sc);
}
