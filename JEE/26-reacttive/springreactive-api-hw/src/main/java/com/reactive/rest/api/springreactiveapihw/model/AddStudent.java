package com.reactive.rest.api.springreactiveapihw.model;

public class AddStudent {
    private int id;

    private String name;

    private String college;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

  
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the college
     */
    public String getCollege() {
        return college;
    }

    /**
     * @param college the college to set
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * @param id
     * @param name
     * @param college
     */
    public AddStudent(int id, String name, String college) {
        this.id = id;
        this.name = name;
        this.college = college;
    }

    public AddStudent() {
        
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "AddStudent [college=" + college + ", id=" + id + ", name=" + name + "]";
    }

    
}
