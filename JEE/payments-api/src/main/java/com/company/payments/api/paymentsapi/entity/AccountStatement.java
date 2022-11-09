package com.company.payments.api.paymentsapi.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tbl_account_statement")
public class AccountStatement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stmId;

    private double value;

    private Boolean isCredit;

    private String description;

    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinColumn(name="bank_id")
    private BankAccount bankAccount;
    
}
