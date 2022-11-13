package com.apstore.api.pos.apstoreposapi.vo;

import javax.persistence.criteria.Order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * CreateOrderRequest
 */
@Getter
@Setter
@ToString
public class CreateOrderResponse {
    private String id;
    private String status;
}

