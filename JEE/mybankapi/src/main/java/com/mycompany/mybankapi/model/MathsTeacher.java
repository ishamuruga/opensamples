package com.mycompany.mybankapi.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("m")
public class MathsTeacher extends Teacher {
    
    private String coreSub;

    private int maxHours;

    public String getCoreSub() {
        return coreSub;
    }

    public void setCoreSub(String coreSub) {
        this.coreSub = coreSub;
    }

    public int getMaxHours() {
        return maxHours;
    }

    public void setMaxHours(int maxHours) {
        this.maxHours = maxHours;
    }

    @Override
    public String toString() {
        return "MathsTeacher [coreSub=" + coreSub + ", maxHours=" + maxHours + "]";
    }

    

}
