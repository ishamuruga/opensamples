package com.corejava.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //avoid
        // UPIPaymentManager upi = new UPIPaymentManager(null, 0);
        // CCardPaymentManager ccard = new CCardPaymentManager(0, null);


        PaymentManager payUPIMgr = new UPIPaymentManager(null, 0);
        PaymentManager payCCMgr = new CCardPaymentManager(0, null);

        payUPIMgr.doPayment();
        payCCMgr.doPayment();

        List lstPayments= new ArrayList();
        lstPayments.add(new UPIPaymentManager(null, 0));
        lstPayments.add(new CCardPaymentManager(0, null));
        lstPayments.add(new UPIPaymentManager(null, 0));
        lstPayments.add(new CCardPaymentManager(0, null));
        lstPayments.add(new UPIPaymentManager(null, 0));
        lstPayments.add(new CCardPaymentManager(0, null));
        lstPayments.add(new NBPaymentManager(0));
        lstPayments.add(new NBPaymentManager(0));

        
        for(int i=0;i<lstPayments.size();i++){
            PaymentManager pMgr = (PaymentManager) lstPayments.get(i);

            pMgr.doPayment();
        }

    }
}
