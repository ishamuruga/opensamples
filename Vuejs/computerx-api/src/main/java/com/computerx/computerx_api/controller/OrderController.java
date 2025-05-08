package com.computerx.computerx_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.computerx.computerx_api.entity.XOrder;
import com.computerx.computerx_api.repo.XOrderRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private XOrderRepo oRepo;

    @GetMapping
    public ResponseEntity<List<XOrder>> fetchAll() {
        List<XOrder> lstOrder = oRepo.findAll();

        return new ResponseEntity<>(lstOrder, HttpStatus.OK);
    }
}
