package com.company.payment.api.mypaymentapi.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_customer")
@Getter
@Setter
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int custId;

    @Column(name="custname")
    private String name;
    
    @Column(unique = true)
    private String email;
    
    private Calendar dob;
    
    private Calendar ts;
}
