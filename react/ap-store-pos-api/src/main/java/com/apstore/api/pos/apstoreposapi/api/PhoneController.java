package com.apstore.api.pos.apstoreposapi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apstore.api.pos.apstoreposapi.model.Phone;
import com.apstore.api.pos.apstoreposapi.repo.PhoneRepo;

@RestController
@RequestMapping("/api/auth")
public class PhoneController {
    
    @Autowired
    private PhoneRepo phoneRepo;

    @GetMapping(value = "/phones",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Phone>> fetch(){
        return ResponseEntity.ok(phoneRepo.findAll());
    }

    @PostMapping(value = "/phone",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Phone> save(@RequestBody  Phone phone){

        phoneRepo.save(phone);
        return ResponseEntity.ok(phone);
    }
}
