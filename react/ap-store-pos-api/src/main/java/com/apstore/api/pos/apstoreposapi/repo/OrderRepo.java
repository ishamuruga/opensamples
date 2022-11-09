package com.apstore.api.pos.apstoreposapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apstore.api.pos.apstoreposapi.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {
    
}
