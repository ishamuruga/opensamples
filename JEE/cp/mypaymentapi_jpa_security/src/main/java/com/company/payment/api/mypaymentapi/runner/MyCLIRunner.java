package com.company.payment.api.mypaymentapi.runner;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.transaction.TransactionScoped;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.company.payment.api.mypaymentapi.entity.Account;
import com.company.payment.api.mypaymentapi.entity.AccountType;
import com.company.payment.api.mypaymentapi.entity.Address;
import com.company.payment.api.mypaymentapi.entity.Customer;
import com.company.payment.api.mypaymentapi.entity.Role;
import com.company.payment.api.mypaymentapi.entity.User;
import com.company.payment.api.mypaymentapi.entity.inheritance.A4Sheet;
import com.company.payment.api.mypaymentapi.entity.inheritance.DebitCardPayment;
import com.company.payment.api.mypaymentapi.entity.inheritance.EmailOrder;
import com.company.payment.api.mypaymentapi.entity.inheritance.MobileOrder;
import com.company.payment.api.mypaymentapi.entity.inheritance.MyOrder;
import com.company.payment.api.mypaymentapi.entity.inheritance.Pen;
import com.company.payment.api.mypaymentapi.entity.inheritance.Product;
import com.company.payment.api.mypaymentapi.entity.inheritance.UPIPayments;
import com.company.payment.api.mypaymentapi.repo.AccountTypeRepo;
import com.company.payment.api.mypaymentapi.repo.AddressRepository;
import com.company.payment.api.mypaymentapi.repo.OrderRepository;
import com.company.payment.api.mypaymentapi.repo.PaymentRepo;
import com.company.payment.api.mypaymentapi.repo.ProductRepository;
import com.company.payment.api.mypaymentapi.repo.UserRepository;
import com.company.payment.api.mypaymentapi.service.AddressManager;
import com.company.payment.api.mypaymentapi.service.CustomerManager;

@Component
public class MyCLIRunner implements CommandLineRunner {

    @Autowired
    private AddressManager addrManager;
    
    @Autowired
    private CustomerManager custManager;

    @Autowired
    private AccountTypeRepo actRepo;

    @Autowired
    private AddressRepository addRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PaymentRepo payRepo;

    @Autowired
    private ProductRepository prodRepo;

    @Autowired
    private OrderRepository orderRepo;

    @Override
    public void run(String... args) throws Exception {

        Customer c1 = new Customer();
        c1.setDob(Calendar.getInstance());
        c1.setEmail("xyz@gmail.com" + Math.random());
        c1.setName("SuperStar");
        c1.setTs(Calendar.getInstance());


        //AccountType actType1 = actRepo.findById("CURRENT").get();
        //AccountType actType2 = actRepo.findById("SAVINGS").get();
        //AccountType actType3 = actRepo.findById("RD").get();

        // AccountType actType1 = new AccountType();
        // actType1.setId(1);
        // actType1.setName("Savings");

        // AccountType actType2 = new AccountType();
        // actType2.setId(2);
        // actType2.setName("Current");

        // AccountType actType3 = new AccountType();
        // actType3.setId(3);
        // actType3.setName("FD");



        Account a1 = new Account();
        a1.setBalance(1000);
        a1.setName("Company1");
        //a1.setAType(actType1);

        Account a2 = new Account();
        a2.setBalance(2000);
        a2.setName("Company2");
        //a2.setAType(actType2);

        Account a3 = new Account();
        a3.setBalance(3000);
        a3.setName("Company3");
        //a3.setAType(actType3);

        Set<Account> accts = new HashSet<>();
        accts.add(a1);
        accts.add(a2);
        accts.add(a3);

        //c1.setAccounts(accts);

        Address add1 = new Address();
        add1.setAddCode(UUID.randomUUID().toString());
        add1.setAdddress1("123 abcd");
        add1.setAdddress2("adddress2");
        add1.setAdddress3("adddress3");
        add1.setAdddress3("adddress3");
        add1.setCity("Chennai");
        add1.setCountry("IN");
        add1.setPcode("123232");
        add1.setTs(Calendar.getInstance());
        add1.setCust(c1);

        Address add2 = new Address();
        add2.setAddCode(UUID.randomUUID().toString());
        add2.setAdddress1("567 abcd");
        add2.setAdddress2("adddress2");
        add2.setAdddress3("adddress3");
        add2.setAdddress3("adddress3");
        add2.setCity("Hyderabad");
        add2.setCountry("IN");
        add2.setPcode("6565765");
        add2.setTs(Calendar.getInstance());
        add2.setCust(c1);
        

        //custManager.save(c1);

        //addRepo.save(add1);
        //addRepo.save(add2);

        Role r1 = new Role(1,"ADMIN");
        Role r2 = new Role(3,"USER");
        Role r3 = new Role(2,"EXTUSER");

        List<Role> roles = Arrays.asList(r1,r2,r3);

        User u1 = new User(1,"User1",roles);
        User u2 = new User(2,"User2",roles);
        
        //userRepo.save(u1);
        //userRepo.save(u2);
        // System.out.println(actType1.hashCode());
        // System.out.println(actType2.hashCode());
        // System.out.println(actType3.hashCode()); 
        //custManager.fullSave(c1);

        // Address addr = new Address();
        // addr.setAddCode("fa393d9b-4787-46d4-b226-81c6ddcf77e1");
        // //addr.setAddCode(UUID.randomUUID().toString());
        // addr.setAdddress1("123 Abcd street");
        // addr.setAdddress2("Super Duper Aveue");
        // addr.setAdddress3("Cross Street Nagar");
        // addr.setCity("Chennai");
        // addr.setCountry("India");
        // addr.setTs(Calendar.getInstance());
        // addr.setPcode("600092");

        //addrManager.save(addr);

        //custManager.fullSave(c1, addr);

        //System.out.println(custManager.getCustomerById(27));

        UPIPayments upi = new UPIPayments();
        upi.setAmount(1111);
        upi.setTxnRefNumber("UPI1223232");
        upi.setUpiAuthCode("AUTH23232");
        upi.setUpiId("raasas@okicici");
        upi.setType("UPI");

        DebitCardPayment dbC = new DebitCardPayment();
        dbC.setAmount(22222);
        dbC.setDbCardNumber("12232323232");
        dbC.setProvider("VISA");
        dbC.setTxnRefNumber("DBC34343434343");
        dbC.setType("DBC");

        //payRepo.save(upi);
        //payRepo.save(dbC);


        //payRepo.getPayments().forEach(System.out::println);
        //payRepo.getPaymentsById(1000).forEach(System.out::println);

        Pen pen = new Pen();
        pen.setInkColor("blue");
        pen.setProdname("Camlin");

        A4Sheet a4 = new A4Sheet();
        a4.setProdname("TNPCL");
        a4.setPaperColor("milk white");

        A4Sheet a14 = new A4Sheet();
        a14.setProdname("DellPaper");
        a14.setPaperColor("half white");

        //prodRepo.save(pen);
        //prodRepo.save(a4);
        //prodRepo.save(a14);
        
        List<Product> prods = prodRepo.findAll();

        for(Product p : prods){
            if (p instanceof A4Sheet) {
                A4Sheet a42 = (A4Sheet)p;
                //System.out.println(a42);
            } else if (p instanceof Pen) {
                Pen pen2 = (Pen)p;
                //System.out.println(pen2);
            }
        }


        //MyOrder order=  new MyOrder();
        

        MobileOrder mo = new MobileOrder();
        mo.setAmount(2000);
        mo.setOrderName("Furniture");
        mo.setLocation("Chennai");
        mo.setMobileNumber("0532042343223");
        
        EmailOrder eOrder = new EmailOrder();
        eOrder.setAmount(1234);
        eOrder.setCity("Madurai");
        eOrder.setEmail("abcd22@gmail.com");
        eOrder.setOrderName("Grocerries");

        orderRepo.save(mo);
        orderRepo.save(eOrder);

        System.out.println(orderRepo.findById(5).get().toString());
        
        System.out.println("---------------Completed");    


        
    }
    
}
