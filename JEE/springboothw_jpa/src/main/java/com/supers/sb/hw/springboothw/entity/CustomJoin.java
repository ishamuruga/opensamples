package com.supers.sb.hw.springboothw.entity;

import java.util.Date;

public class CustomJoin {
    private String name;

    private int age;
    
    private String email;

    private Date dob;

    /**
     * @param name
     * @param age
     * @param email
     * @param dob
     */
    public CustomJoin(String name, String email, int age, Date dob) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.dob = dob;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "CustomJoin [age=" + age + ", dob=" + dob + ", email=" + email + ", name=" + name + "]";
    }



}
