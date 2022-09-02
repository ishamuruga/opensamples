package com.company.payment.api.mypaymentapi.entity.inheritance;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.company.payment.api.mypaymentapi.entity.Account;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class UPIPayments extends Payment {

    private String upiId;

    private String upiAuthCode;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="acct",referencedColumnName = "id")
    private Account account;
}
