package com.company.payments.api.paymentsapi.dto;

import java.util.Calendar;
import java.util.Set;

import com.company.payments.api.paymentsapi.entity.BankAccount;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCustomerRequest {
    private String name;

    private String email;

    @JsonFormat(pattern = "mm/dd/yyyy")
    private Calendar dob;

    private Set<BankAccount> bankAccounts;
}
