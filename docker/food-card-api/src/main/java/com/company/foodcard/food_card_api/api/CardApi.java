package com.company.foodcard.food_card_api.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.foodcard.food_card_api.entiry.Card;
import com.company.foodcard.food_card_api.service.CardManagerImpl;

@RestController
@RequestMapping("api")
@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
public class CardApi {

    @Autowired
    private CardManagerImpl service;

    @GetMapping(path = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Card>> fetchAll(){
        return new ResponseEntity<>(service.fetchAll(),HttpStatus.OK);
    }

    @GetMapping(path = "/:id",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Card> fetchAllById(@RequestParam int id){
        return new ResponseEntity<>(service.fetchById(id),HttpStatus.OK);
    }

    @PostMapping(path = "/save",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Card> save(@RequestBody Card card){
        service.save(card);
        return new ResponseEntity<>(card,HttpStatus.OK);
    }    
}
