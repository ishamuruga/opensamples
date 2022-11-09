package com.company.payments.api.paymentsapi.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.ru.INN;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "tbl_bank_account")
@ToString
public class BankAccount {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String bankCode;

    @Column(unique = true)
    private String accNbr;

    private double balance;

    @OneToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinColumn(name = "bank_acc_type_id")
    private AccountType aType;

    // @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    // @JoinColumn(name = "bank_acct_id")
    // private List<AccountStatement> stmts;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((bankCode == null) ? 0 : bankCode.hashCode());
        result = prime * result + ((accNbr == null) ? 0 : accNbr.hashCode());
        long temp;
        temp = Double.doubleToLongBits(balance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BankAccount other = (BankAccount) obj;
        if (id != other.id)
            return false;
        if (bankCode == null) {
            if (other.bankCode != null)
                return false;
        } else if (!bankCode.equals(other.bankCode))
            return false;
        if (accNbr == null) {
            if (other.accNbr != null)
                return false;
        } else if (!accNbr.equals(other.accNbr))
            return false;
        if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
            return false;
        return true;
    }



}
