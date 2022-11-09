package com.apstore.api.pos.apstoreposapi.service;

import java.util.Optional;

import com.apstore.api.pos.apstoreposapi.model.Order;

public interface OrderManager {
    public void saveOrder(Order order);
    public Optional<Order> findById(Integer id);
}
