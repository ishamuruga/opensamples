package com.company.payments.api.paymentsapi.service;

import com.company.payments.api.paymentsapi.entity.AccountType;

public interface AccountTypeManager {
    public AccountType fetchById(Integer id);
}
