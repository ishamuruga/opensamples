package com.company.reactive.springreactive.repo;

import com.company.reactive.springreactive.entity.SuperCar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperCarRepository extends JpaRepository<SuperCar,Long> {
    
}
