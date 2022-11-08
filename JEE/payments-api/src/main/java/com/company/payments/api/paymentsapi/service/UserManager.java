package com.company.payments.api.paymentsapi.service;

import java.util.List;
import java.util.Optional;

import com.company.payments.api.paymentsapi.entity.User;

public interface UserManager {
    public void save(User u);

    public List<User> fetchALL();

    public Optional<User> findById(Integer id);
}
