package com.company.payment.api.mypaymentapi.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.company.payment.api.mypaymentapi.entity.User;
import com.company.payment.api.mypaymentapi.repo.UserRepository;

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByUser(username).orElseThrow(
            () -> new UsernameNotFoundException("User Not found with username:-" + username)
        );

        return UserDetailsBuilder.build(user);
    }
    
}
