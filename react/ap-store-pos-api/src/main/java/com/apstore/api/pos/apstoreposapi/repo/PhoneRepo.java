package com.apstore.api.pos.apstoreposapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apstore.api.pos.apstoreposapi.model.Phone;

@Repository
public interface PhoneRepo extends JpaRepository<Phone,Integer> {
    
}
