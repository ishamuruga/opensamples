package com.corejava.service;

import com.corejava.exceptions.BusinessException;
import com.corejava.exceptions.InSufficientBalanceException;
import com.corejava.exceptions.UserNotFoundException;

public interface PaymentManager {
    public Boolean findCustomer(String id) throws UserNotFoundException;
    public String checkBalance(String accoutNumber) throws InSufficientBalanceException ;
    public String doFundTransfer(String id, String accNumber) throws BusinessException;
}
