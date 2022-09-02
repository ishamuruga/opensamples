package com.company.payment.api.mypaymentapi.entity.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue(value = "P")
@Getter
@Setter
public class Pen extends Product {
    
    private String inkColor;
}
