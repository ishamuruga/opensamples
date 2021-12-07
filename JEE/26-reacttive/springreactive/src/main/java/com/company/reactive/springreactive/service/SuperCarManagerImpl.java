package com.company.reactive.springreactive.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.company.reactive.springreactive.entity.SuperCar;
import com.company.reactive.springreactive.repo.SuperCarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
@Transactional
public class SuperCarManagerImpl implements SuperCarManager {

    @Autowired
    private SuperCarRepository repo;

    @Override
    public Flux<SuperCar> getSuperCars() {
        // TODO Auto-generated method stub
        return repo.findAll();
    }

    @Override
    public Optional<SuperCar> findById(SuperCar sc) {
        long id = sc.getId();
        // TODO Auto-generated method stub
        return repo.findById(id);
    
    }

    @Override
    public void save(SuperCar sc) {
        repo.save(sc);
    }
    
}
