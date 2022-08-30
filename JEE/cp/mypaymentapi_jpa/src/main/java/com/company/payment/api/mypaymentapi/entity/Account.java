package com.company.payment.api.mypaymentapi.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_account")
@Getter
@Setter
public class Account extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int balance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="act_type",referencedColumnName = "id")
    private AccountType aType;

}
