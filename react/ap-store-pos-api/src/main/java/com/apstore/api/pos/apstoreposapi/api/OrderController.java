package com.apstore.api.pos.apstoreposapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apstore.api.pos.apstoreposapi.service.OrderManager;
import com.apstore.api.pos.apstoreposapi.vo.CreateOrderRequest;
import com.apstore.api.pos.apstoreposapi.vo.CreateOrderResponse;

@RestController
@RequestMapping("/api/pos")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {
    
    @Autowired
    private OrderManager orderService;

    public ResponseEntity<CreateOrderResponse> save(@RequestBody CreateOrderRequest req) {
return null;
    }

}
