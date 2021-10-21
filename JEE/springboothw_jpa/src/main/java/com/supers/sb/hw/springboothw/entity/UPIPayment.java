package com.supers.sb.hw.springboothw.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_payment_upi")
public class UPIPayment extends Payment {
    private String upiCode;

    /**
     * @return the upiCode
     */
    public String getUpiCode() {
        return upiCode;
    }

    /**
     * @param upiCode the upiCode to set
     */
    public void setUpiCode(String upiCode) {
        this.upiCode = upiCode;
    }
    
}
