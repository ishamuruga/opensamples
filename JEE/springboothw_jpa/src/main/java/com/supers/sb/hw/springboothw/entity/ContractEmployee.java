package com.supers.sb.hw.springboothw.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_contract_employee")
public class ContractEmployee extends Person {
    
    private String vendorCode;

    private Date dOfExit;

    /**
     * @return the vendorCode
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * @param vendorCode the vendorCode to set
     */
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    /**
     * @return the dOfExit
     */
    public Date getdOfExit() {
        return dOfExit;
    }

    /**
     * @param dOfExit the dOfExit to set
     */
    public void setdOfExit(Date dOfExit) {
        this.dOfExit = dOfExit;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "ContractEmployee [dOfExit=" + dOfExit + ", vendorCode=" + vendorCode + "]";
    }


}
