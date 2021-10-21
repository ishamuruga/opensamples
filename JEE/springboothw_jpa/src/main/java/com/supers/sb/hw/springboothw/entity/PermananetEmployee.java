package com.supers.sb.hw.springboothw.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_perm_employee")
public class PermananetEmployee extends Person {
    private String pfNumber;
    
    private String location;

    /**
     * @return the pfNumber
     */
    public String getPfNumber() {
        return pfNumber;
    }

    /**
     * @param pfNumber the pfNumber to set
     */
    public void setPfNumber(String pfNumber) {
        this.pfNumber = pfNumber;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "PermananetEmployee [location=" + location + ", pfNumber=" + pfNumber + "]";
    }

    
}
