package com.supers.sb.hw.springboothw.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="tbl_singapore_zoo")
@PrimaryKeyJoinColumn(name = "zId")
public class SingaporeZoo extends Zoo {
    
    private int nOfElephants;

    private int nOfPython;

    /**
     * @return the nOfElephants
     */
    public int getnOfElephants() {
        return nOfElephants;
    }

    /**
     * @param nOfElephants the nOfElephants to set
     */
    public void setnOfElephants(int nOfElephants) {
        this.nOfElephants = nOfElephants;
    }

    /**
     * @return the nOfPython
     */
    public int getnOfPython() {
        return nOfPython;
    }

    /**
     * @param nOfPython the nOfPython to set
     */
    public void setnOfPython(int nOfPython) {
        this.nOfPython = nOfPython;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "SingaporeZoo [nOfElephants=" + nOfElephants + ", nOfPython=" + nOfPython + "]";
    }

    

    
}
