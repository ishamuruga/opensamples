package com.apstore.api.pos.apstoreposapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apstore.api.pos.apstoreposapi.api.vhelper.CreateOrderControllerVHelper;
import com.apstore.api.pos.apstoreposapi.model.Order;
import com.apstore.api.pos.apstoreposapi.service.OrderManager;
import com.apstore.api.pos.apstoreposapi.vo.CreateOrderRequest;
import com.apstore.api.pos.apstoreposapi.vo.CreateOrderResponse;

@RestController
@RequestMapping("/api/pos")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {

    @Autowired
    private OrderManager orderService;

    @Autowired
    private CreateOrderControllerVHelper createOrderVHelper;

    @PostMapping(value = "/order",produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<CreateOrderResponse> save(@RequestBody CreateOrderRequest req) {
        Order order = createOrderVHelper.createOrderFromVo(req);
        
        orderService.saveOrder(order);

        CreateOrderResponse res = createOrderVHelper.createResponsefromOrder(order);

        return ResponseEntity.ok(res);
    }

}
