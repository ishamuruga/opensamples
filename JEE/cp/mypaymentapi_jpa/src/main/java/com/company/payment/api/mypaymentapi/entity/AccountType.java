package com.company.payment.api.mypaymentapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_accountType")
@Getter
@Setter
public class AccountType extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String description;
}
