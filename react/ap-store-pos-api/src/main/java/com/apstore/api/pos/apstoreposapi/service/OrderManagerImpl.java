package com.apstore.api.pos.apstoreposapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apstore.api.pos.apstoreposapi.model.Order;
import com.apstore.api.pos.apstoreposapi.repo.OrderRepo;

@Service
public class OrderManagerImpl implements OrderManager{

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public void saveOrder(Order order) {
        orderRepo.save(order);
    }

    @Override
    public Optional<Order> findById(Integer id) {
        return orderRepo.findById(id);
    }


    
}
