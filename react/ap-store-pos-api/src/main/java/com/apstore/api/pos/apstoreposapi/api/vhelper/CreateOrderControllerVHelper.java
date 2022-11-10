package com.apstore.api.pos.apstoreposapi.api.vhelper;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Component;

import com.apstore.api.pos.apstoreposapi.model.Category;
import com.apstore.api.pos.apstoreposapi.model.Order;
import com.apstore.api.pos.apstoreposapi.model.OrderDetails;
import com.apstore.api.pos.apstoreposapi.vo.CreateOrderRequest;
import com.apstore.api.pos.apstoreposapi.vo.CreateOrderResponse;
import com.apstore.api.pos.apstoreposapi.vo.OrderDetailsVo;


@Component
public class CreateOrderControllerVHelper {
    
    
    public CreateOrderResponse createResponsefromOrder(Order order) {
        CreateOrderResponse res = new CreateOrderResponse();
        res.setId(order.getId());
        res.setStatus("order created sucessfull on.." + (new java.util.Date()));

        return res;
    }
    
    public Order createOrderFromVo(CreateOrderRequest req) {
        Order order = new Order();
        order.setCost(req.getCost());
        order.setName(req.getName());
        order.setTs(Calendar.getInstance());

        OrderDetailsVo[] orderDetailsVos = req.getOrders();

        List<OrderDetails> orderDetails = new ArrayList();

        for(OrderDetailsVo ovo:orderDetailsVos){

            Category ctrg = new Category();
            OrderDetails ordDet = new OrderDetails();

            ctrg.setName(ovo.getCategory());
            ordDet.setCategory(ctrg);
            ordDet.setCost(ovo.getCost());
            ordDet.setItemName(ovo.getItemName());
            ordDet.setQuantity(ovo.getQuantity());
            ordDet.setTs(Calendar.getInstance());

            orderDetails.add(ordDet);
        }

        order.setOrderDetails(orderDetails);

        return order;
    }
}
