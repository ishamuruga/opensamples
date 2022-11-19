package com.apstore.api.pos.apstoreposapi.service;

import java.util.List;
import java.util.Optional;

import com.apstore.api.pos.apstoreposapi.model.Phone;

public interface PhoneManager {
    public List<Phone> fetchAll();
    public Optional<Phone> findById(Integer id);   
    public List<Phone> findByName(String name);   
    public void save(Phone phone);   
}
