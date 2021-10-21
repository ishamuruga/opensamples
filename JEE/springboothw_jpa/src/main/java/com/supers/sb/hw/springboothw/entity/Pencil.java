package com.supers.sb.hw.springboothw.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PN")
public class Pencil extends Product{
    private String type;

    private Boolean isHB;

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the isHB
     */
    public Boolean getIsHB() {
        return isHB;
    }

    /**
     * @param isHB the isHB to set
     */
    public void setIsHB(Boolean isHB) {
        this.isHB = isHB;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Pencil [isHB=" + isHB + ", type=" + type + "]";
    }

  
    
}
