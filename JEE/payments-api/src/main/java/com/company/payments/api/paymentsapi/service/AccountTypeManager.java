package com.company.payments.api.paymentsapi.service;

import java.util.Optional;

import com.company.payments.api.paymentsapi.entity.AccountType;

public interface AccountTypeManager {
    public Optional<AccountType> fetchById(Integer id);
    public void save(AccountType actType);
}
