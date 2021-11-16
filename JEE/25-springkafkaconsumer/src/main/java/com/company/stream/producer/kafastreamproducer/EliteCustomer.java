package com.company.stream.producer.kafastreamproducer;

public class EliteCustomer {
    private int id;

    private String name;

    private String dept;

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
     * @return the dept
     */
    public String getDept() {
        return dept;
    }

    /**
     * @param dept the dept to set
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * @param id
     * @param name
     * @param dept
     */
    public EliteCustomer(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
    
    public EliteCustomer() {
        
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Elite Customer [dept=" + dept + ", id=" + id + ", name=" + name + "]";
    }

    
}
