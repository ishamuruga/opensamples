package com.supers.sb.hw.springboothw.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("P")
public class Pen extends Product{
    private String inkColor;

    private Boolean isGel;

    /**
     * @return the inkColor
     */
    public String getInkColor() {
        return inkColor;
    }

    /**
     * @param inkColor the inkColor to set
     */
    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    /**
     * @return the isGel
     */
    public Boolean getIsGel() {
        return isGel;
    }

    /**
     * @param isGel the isGel to set
     */
    public void setIsGel(Boolean isGel) {
        this.isGel = isGel;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Pen [inkColor=" + inkColor + ", isGel=" + isGel + "]";
    }

    
}
