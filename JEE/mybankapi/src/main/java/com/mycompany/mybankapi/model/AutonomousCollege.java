package com.mycompany.mybankapi.model;

import javax.persistence.Entity;

@Entity
public class AutonomousCollege extends College {
    private String affUniName;

    public String getAffUniName() {
        return affUniName;
    }

    public void setAffUniName(String affUniName) {
        this.affUniName = affUniName;
    }

    @Override
    public String toString() {
        return "AutonomousCollege [affUniName=" + affUniName + "]";
    }

    
}
