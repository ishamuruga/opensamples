package com.company.payment.api.mypaymentapi.model;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;

public class FundTransferRequest extends BaseModel {
    private int id;

    @NotBlank(message = "Beneficiary cannot be blank or empty")
    private String bene;

    @Range(min = 1, max = 10000,message = "Enter a valid amount")
    private int amount;

    public int getId() {
        return id;
    }

    public FundTransferRequest(int id, String bene, int amount) {
        this.id = id;
        this.bene = bene;
        this.amount = amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBene() {
        return bene;
    }

    public void setBene(String bene) {
        this.bene = bene;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
}
