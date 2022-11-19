package com.apstore.api.pos.apstoreposapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apstore.api.pos.apstoreposapi.model.Phone;
import com.apstore.api.pos.apstoreposapi.repo.PhoneRepo;

@Service
public class PhoneManagerImpl implements PhoneManager {

    @Autowired
    private PhoneRepo phonerepo;

    @Override
    public List<Phone> fetchAll() {
        return phonerepo.findAll();
    }

    @Override
    public Optional<Phone> findById(Integer id) {
        
        return phonerepo.findById(id);
    }

    @Override
    public void save(Phone phone) {
       phonerepo.save(phone);
        
    }

    @Override
    public List<Phone> findByName(String name) {
        return phonerepo.fetchByName(name);
    }
    
}
