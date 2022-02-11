package com.mycompany.mybankapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_subject")
public class Subject extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int marksScored;

    @Temporal(TemporalType.DATE)
    private Date passedDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarksScored() {
        return marksScored;
    }

    public void setMarksScored(int marksScored) {
        this.marksScored = marksScored;
    }

    public Date getPassedDate() {
        return passedDate;
    }

    public void setPassedDate(Date passedDate) {
        this.passedDate = passedDate;
    }

    @Override
    public String toString() {
        return "Subject [id=" + id + ", marksScored=" + marksScored + ", name=" + name + ", passedDate=" + passedDate
                + "]";
    }


}
