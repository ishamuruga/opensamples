package com.supers.sb.hw.springboothw.entity;

import java.io.StringBufferInputStream;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;

@Entity
@Table(name = "tbl_account_statement")
public class AccountStatement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String description;

    private int amount;

    private Date dOfTxn;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "accId")
    private BankAccount bAccount;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the dOfTxn
     */
    public Date getdOfTxn() {
        return dOfTxn;
    }

    /**
     * @param dOfTxn the dOfTxn to set
     */
    public void setdOfTxn(Date dOfTxn) {
        this.dOfTxn = dOfTxn;
    }

    /**
     * @return the bAccount
     */
    public BankAccount getbAccount() {
        return bAccount;
    }

    /**
     * @param bAccount the bAccount to set
     */
    public void setbAccount(BankAccount bAccount) {
        this.bAccount = bAccount;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "AccountStatement [amount=" + amount + ", bAccount=" + bAccount + ", dOfTxn=" + dOfTxn + ", description="
                + description + ", id=" + id + "]";
    }

    
}
