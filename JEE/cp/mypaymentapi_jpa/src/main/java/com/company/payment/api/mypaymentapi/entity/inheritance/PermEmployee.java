package com.company.payment.api.mypaymentapi.entity.inheritance;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PermEmployee extends Employee {
    
    private String location;
}
