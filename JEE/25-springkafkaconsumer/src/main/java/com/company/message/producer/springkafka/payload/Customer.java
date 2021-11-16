package com.company.message.producer.springkafka.payload;

public class Customer extends BaseModel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    private String email;

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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Customer [email=" + email + ", id=" + id + ", name=" + name + "]";
    }

    
    
}
