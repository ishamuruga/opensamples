package com.company.payment.api.mypaymentapi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.company.payment.api.mypaymentapi.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

    public Optional<User> findByUser(String username);

    @Query("from User u where u.user=:username")
    public Optional<User> fetchUserByName(String username);
}
