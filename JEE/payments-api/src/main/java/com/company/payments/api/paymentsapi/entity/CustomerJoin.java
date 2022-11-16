package com.company.payments.api.paymentsapi.entity;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerJoin {
    //c.id,c.name,c.email,c.dob,ba.accNbr,ba.balance

    private int id;

    private String name;

    private String email;

    private Calendar dob;

    public CustomerJoin(int id, String name, String email, Calendar dob, String accNbr, double balace) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.accNbr = accNbr;
        this.balace = balace;
    }

    private String accNbr;

    private double balace;

    
}
