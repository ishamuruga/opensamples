package com.corejava.nested;

import java.util.Calendar;

class MyBusinessService {

    private static MyBusinessService myBusService = null;
    
    //Instance Variable
    //Shared
    //private int a = 0;

    private MyBusinessService() {
        //Nothing
    }
    
    public static MyBusinessService getInstance() {
        if (myBusService == null) {
            myBusService = new MyBusinessService();
        }
        
        return myBusService;
    }
    
    public int add2Numbers(int x, int y) {
        int a =x+y;
        return a;
    }

}

public class MyBusinessServiceClient {
    public static void main(String[] args) {
        MyBusinessService myBusSrvs1 = MyBusinessService.getInstance();
        MyBusinessService myBusSrvs2 = MyBusinessService.getInstance();
        MyBusinessService myBusSrvs3 = MyBusinessService.getInstance();
        MyBusinessService myBusSrvs4 = MyBusinessService.getInstance();
        MyBusinessService myBusSrvs5 = MyBusinessService.getInstance();
        
        int res1 = myBusSrvs1.add2Numbers(5, 6);
        int res2 = myBusSrvs2.add2Numbers(6, 6);
        int res3 = myBusSrvs3.add2Numbers(7, 6);
        int res4 = myBusSrvs4.add2Numbers(8, 6);
        
        System.out.println(res1);
    }
}
