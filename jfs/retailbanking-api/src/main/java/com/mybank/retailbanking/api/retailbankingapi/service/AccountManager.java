package com.mybank.retailbanking.api.retailbankingapi.service;

import java.util.List;

import com.mybank.retailbanking.api.retailbankingapi.entity.Account;

public interface AccountManager {
    public void save(Account act);

    public List<Account> fetchAll();
}
