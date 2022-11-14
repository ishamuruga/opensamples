package com.company.payments.api.paymentsapi.entity.inh;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tbl_product")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int prodId;

    private String manuf;

}
