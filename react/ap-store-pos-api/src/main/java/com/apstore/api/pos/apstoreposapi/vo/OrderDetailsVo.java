package com.apstore.api.pos.apstoreposapi.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class OrderDetailsVo {
    private int quantity;

    private String itemName;

    private int category;

    private double cost;
    
}