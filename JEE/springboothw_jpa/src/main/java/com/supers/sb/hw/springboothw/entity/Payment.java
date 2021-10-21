package com.supers.sb.hw.springboothw.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Payment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paymanetId;

    private String txnRefNumber;

    /**
     * @return the paymanetId
     */
    public int getPaymanetId() {
        return paymanetId;
    }

    /**
     * @param paymanetId the paymanetId to set
     */
    public void setPaymanetId(int paymanetId) {
        this.paymanetId = paymanetId;
    }

    /**
     * @return the txnRefNumber
     */
    public String getTxnRefNumber() {
        return txnRefNumber;
    }

    /**
     * @param txnRefNumber the txnRefNumber to set
     */
    public void setTxnRefNumber(String txnRefNumber) {
        this.txnRefNumber = txnRefNumber;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Payment [paymanetId=" + paymanetId + ", txnRefNumber=" + txnRefNumber + "]";
    }

    
}
