package com.company.payments.api.paymentsapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.payments.api.paymentsapi.entity.User;
import com.company.payments.api.paymentsapi.repo.UserRepo;

@Service
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserRepo userRepo;

    @Override
    public void save(User u) {
        userRepo.save(u);
    }

    @Override
    public List<User> fetchALL() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        Optional<User> u = userRepo.findById(id);
        if (u.isPresent()){
            return u;
        } else {
            return Optional.empty();
        }
    }
    
}
