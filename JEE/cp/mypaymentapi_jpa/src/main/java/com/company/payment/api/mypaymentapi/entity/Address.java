package com.company.payment.api.mypaymentapi.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_address")
@Getter
@Setter
public class Address extends BaseEntity{
    
    @Id
    private String addCode;

    private String adddress1;
    private String adddress2;
    private String adddress3;
    private String pcode;
    private String city;
    private String country;

    private Calendar ts;

}
