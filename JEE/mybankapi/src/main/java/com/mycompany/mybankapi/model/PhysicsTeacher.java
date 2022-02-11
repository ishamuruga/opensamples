package com.mycompany.mybankapi.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("p")
public class PhysicsTeacher extends Teacher {
    private int weeks;

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    @Override
    public String toString() {
        return "PhysicsTeacher [weeks=" + weeks + "]";
    }

    
}
