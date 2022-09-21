package com.mybank.retailbanking.api.retailbankingapi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybank.retailbanking.api.retailbankingapi.entity.Account;
import com.mybank.retailbanking.api.retailbankingapi.service.AccountManager;

@RestController
@RequestMapping("/api")
@CrossOrigin(maxAge = 3600)
public class AccountController extends BaseController{
    
    @Autowired
    private AccountManager service;

    @GetMapping(value="/accounts",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Account>> findAll() {
        return ResponseEntity.ok(service.fetchAll());
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Account> save(@RequestBody Account act) {
        service.save(act);
        return ResponseEntity.ok(act);
    }
}
