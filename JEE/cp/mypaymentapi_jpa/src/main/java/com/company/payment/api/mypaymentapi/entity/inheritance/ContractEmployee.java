package com.company.payment.api.mypaymentapi.entity.inheritance;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ContractEmployee extends Employee {
    
    private Date doj;
}
