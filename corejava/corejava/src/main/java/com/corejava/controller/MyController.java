package com.corejava.controller;

import com.corejava.service.PaymentManager;
import com.corejava.exceptions.BusinessException;
import com.corejava.exceptions.InSufficientBalanceException;
import com.corejava.exceptions.UserNotFoundException;
import com.corejava.service.MyPaymentManager;

public class MyController extends BaseController {

    public static void main(String[] args) {
        PaymentManager pay = new MyPaymentManager();
//        try {
//            pay.findCustomer("43434");
//            
//            pay.checkBalance("ffdfdf1223fdfddf");    
//            System.out.println("Completed");
//        }catch(UserNotFoundException ue) {
//            ue.printStackTrace();
//        }catch(InSufficientBalanceException ise) {
//            ise.printStackTrace();
//        }
        
        String data = "";
        try {
            data = pay.doFundTransfer("123super", "DFD123FSDSDS");
        }catch(BusinessException be) {
            System.out.println("Expected one");
            be.printStackTrace();
        }catch(Exception ex) {
            System.out.println("Bug in my code");
            ex.printStackTrace();
        }
        
        System.out.println(data);
        

    }

}
