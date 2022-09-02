package com.company.payment.api.mypaymentapi.entity.inheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class MyOrder {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;

    private String orderName;

    private int amount;
}
