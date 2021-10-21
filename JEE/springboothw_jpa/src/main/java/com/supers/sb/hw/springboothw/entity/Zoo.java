package com.supers.sb.hw.springboothw.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_zoo")
@Inheritance(strategy = InheritanceType.JOINED)
public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int zId;

    private String location;

    /**
     * @return the zId
     */
    public int getzId() {
        return zId;
    }

    /**
     * @param zId the zId to set
     */
    public void setzId(int zId) {
        this.zId = zId;
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
        return "Zoo [location=" + location + ", zId=" + zId + "]";
    }

    
}
