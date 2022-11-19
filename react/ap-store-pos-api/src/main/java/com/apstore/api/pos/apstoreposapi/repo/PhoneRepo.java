package com.apstore.api.pos.apstoreposapi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.apstore.api.pos.apstoreposapi.model.Phone;

@Repository
public interface PhoneRepo extends JpaRepository<Phone,Integer> {
    @Query("from Phone p where p.name=:name")
    public List<Phone> fetchByName(String name);
}
