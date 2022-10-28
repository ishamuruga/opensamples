package com.corejava.service;

import com.corejava.exceptions.BusinessException;
import com.corejava.exceptions.InSufficientBalanceException;
import com.corejava.exceptions.UserNotFoundException;

public class MyPaymentManager implements PaymentManager {

    @Override
    public Boolean findCustomer(String id) throws UserNotFoundException {
        if (id.equalsIgnoreCase("123")) {
            throw new UserNotFoundException("Invalid User");
        }
        return true;
    }

    @Override
    public String checkBalance(String accoutNumber) throws InSufficientBalanceException {
        if (accoutNumber.contains("123")) {
            throw new InSufficientBalanceException("Account Number.." + accoutNumber + " has no Balance");
        }
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String doFundTransfer(String id, String accNumber) throws BusinessException {
        // TODO Auto-generated method stub
        Boolean b = false;
        String mess = "";
        try {
            b = findCustomer(id);    
        } catch (UserNotFoundException ue) {
            throw new BusinessException("Invalid User", ue);
        }
        
        
        
        try {
            mess = checkBalance(accNumber);
        }catch (InSufficientBalanceException ise) {
            throw new BusinessException("Insufficient Balanc", ise);    
        }
        
        if (id.equalsIgnoreCase("super")) {
            int k=7/0;
        }
        
        return id.concat(accNumber);
        
    }
    
    

}
