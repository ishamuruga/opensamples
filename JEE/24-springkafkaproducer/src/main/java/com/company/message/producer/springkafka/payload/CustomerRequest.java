package com.vircompanytusa.message.producer.springkafka.payload;

public class CustomerRequest extends BaseModel {
    private String state;

    private Customer cust;

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the cust
     */
    public Customer getCust() {
        return cust;
    }

    /**
     * @param cust the cust to set
     */
    public void setCust(Customer cust) {
        this.cust = cust;
    }
    
}
