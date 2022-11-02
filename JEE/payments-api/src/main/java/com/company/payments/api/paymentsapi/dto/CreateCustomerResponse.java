package com.company.payments.api.paymentsapi.dto;

import java.util.Calendar;
import java.util.Set;

import com.company.payments.api.paymentsapi.entity.BankAccount;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCustomerResponse {
    private String name;

    private String email;

    private Calendar dob;

    private int id;

    private String status;

    private Set<BankAccount> accounts;
}
