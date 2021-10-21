package com.supers.sb.hw.springboothw.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="tbl_chennai_zoo")
@PrimaryKeyJoinColumn(name = "zId")
public class ChennaiZoo extends Zoo {
    
    private int nOfTigers;

    private int nOfLions;

    /**
     * @return the nOfTigers
     */
    public int getnOfTigers() {
        return nOfTigers;
    }

    /**
     * @param nOfTigers the nOfTigers to set
     */
    public void setnOfTigers(int nOfTigers) {
        this.nOfTigers = nOfTigers;
    }

    /**
     * @return the nOfLions
     */
    public int getnOfLions() {
        return nOfLions;
    }

    /**
     * @param nOfLions the nOfLions to set
     */
    public void setnOfLions(int nOfLions) {
        this.nOfLions = nOfLions;
    }

    
}
