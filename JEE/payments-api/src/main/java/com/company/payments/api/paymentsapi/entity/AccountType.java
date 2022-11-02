package com.company.payments.api.paymentsapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_account_type")
public class AccountType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String type;
}
