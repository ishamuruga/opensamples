package com.company.payment.api.mypaymentapi.entity.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue(value = "A4")
@Getter
@Setter
public class A4Sheet extends Product {
    
    private String paperColor;
}
