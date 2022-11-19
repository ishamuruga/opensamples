package com.apstore.api.pos.apstoreposapi.api;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apstore.api.pos.apstoreposapi.model.Phone;
import com.apstore.api.pos.apstoreposapi.repo.PhoneRepo;
import com.apstore.api.pos.apstoreposapi.service.PhoneManager;

@RestController
@RequestMapping("/api/auth")
public class PhoneController {
    
    @Autowired
    private PhoneManager service;


    @GetMapping(value = "/phones",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Phone>> fetch(){
        return ResponseEntity.ok(service.fetchAll());
    }

    @PostMapping(value = "/phone",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Phone> save(@RequestBody  Phone phone){

        service.save(phone);
        return ResponseEntity.ok(phone);
    }

    @GetMapping(value = "/phone/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Phone> fetchById(@PathVariable int id) {
        return ResponseEntity.ok(service.findById(id).get());
    }

    @GetMapping(value = "/phone2/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Phone> fetchByName(@PathVariable String name) {
        return ResponseEntity.ok(service.findByName(name).get(0));
    }
}
