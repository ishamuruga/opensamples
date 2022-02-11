package com.mycompany.mybankapi.model;

import javax.persistence.Entity;

@Entity
public class DeemedUniv extends College {
    private int countofPrograms;
    
    private boolean isPhdOffered;

    public int getCountofPrograms() {
        return countofPrograms;
    }

    public void setCountofPrograms(int countofPrograms) {
        this.countofPrograms = countofPrograms;
    }

    public boolean isPhdOffered() {
        return isPhdOffered;
    }

    public void setPhdOffered(boolean isPhdOffered) {
        this.isPhdOffered = isPhdOffered;
    }

    @Override
    public String toString() {
        return "DeemedUniv [countofPrograms=" + countofPrograms + ", isPhdOffered=" + isPhdOffered + "]";
    }

    
}
