package com.company.payments.api.paymentsapi.cli_runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.lang.model.element.Element;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.company.payments.api.paymentsapi.entity.AccountStatement;
import com.company.payments.api.paymentsapi.entity.AccountType;
import com.company.payments.api.paymentsapi.entity.BankAccount;
import com.company.payments.api.paymentsapi.entity.Customer;
import com.company.payments.api.paymentsapi.entity.Role;
import com.company.payments.api.paymentsapi.entity.User;
import com.company.payments.api.paymentsapi.entity.inh.Book;
import com.company.payments.api.paymentsapi.entity.inh.ContEmployee;
import com.company.payments.api.paymentsapi.entity.inh.Elephant;
import com.company.payments.api.paymentsapi.entity.inh.Lion;
import com.company.payments.api.paymentsapi.entity.inh.Pen;
import com.company.payments.api.paymentsapi.entity.inh.PermEmployee;
import com.company.payments.api.paymentsapi.entity.inh.Tiger;
import com.company.payments.api.paymentsapi.repo.AnimalRepo;
import com.company.payments.api.paymentsapi.repo.BankAccountRepo;
import com.company.payments.api.paymentsapi.repo.BankAccountStatementRepo;
import com.company.payments.api.paymentsapi.repo.BankAccountTypeRepo;
import com.company.payments.api.paymentsapi.repo.CustomerRepo;
import com.company.payments.api.paymentsapi.repo.ProductRepo;
import com.company.payments.api.paymentsapi.repo.RoleRepo;
import com.company.payments.api.paymentsapi.service.AccountTypeManager;
import com.company.payments.api.paymentsapi.service.CustomerManager;
import com.company.payments.api.paymentsapi.service.EmployeeManager;
import com.company.payments.api.paymentsapi.service.UserManager;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CustomerManager custService;

    @Autowired
    private AccountTypeManager accTypeService;

    @Autowired
    private UserManager userManager;

    @Autowired
    private RoleRepo roleRepo;

    @Autowired
    private BankAccountTypeRepo bankTypeRepo;

    @Autowired
    private BankAccountRepo accountRepo;

    @Autowired
    private BankAccountStatementRepo stmtRepo;

    @Autowired
    private EmployeeManager empManager;

    @Autowired
    private AnimalRepo animalRepo;

    @Autowired
    private ProductRepo prodRepo;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("############################################");
        System.out.println("My Command Line Started");
        System.out.println("############################################");

        // AccountType aType1 = new AccountType();
        // aType1.setType("SAVINGS");

        // AccountType aType2 = new AccountType();
        // aType2.setType("CURRENT");


        if(!accTypeService.fetchById(1).isPresent()){
            AccountType actType1 = new AccountType();
            actType1.setId(1);
            actType1.setType("SAV");

            AccountType actType2 = new AccountType();
            actType2.setId(2);
            actType2.setType("CURR");

            accTypeService.save(actType1);
            accTypeService.save(actType2);
        }


        AccountType aType1 = accTypeService.fetchById(1).get();
        AccountType aType2 = accTypeService.fetchById(2).get();

        BankAccount ba1 = new BankAccount();
        ba1.setAType(aType2);
        ba1.setAccNbr("00770101010");
        ba1.setBalance(1000);
        ba1.setBankCode("BNK001");

        BankAccount ba2 = new BankAccount();
        ba2.setAType(aType1);
        ba2.setAccNbr("00770101011");
        ba2.setBalance(1001);
        ba2.setBankCode("BNK002");

        Set<BankAccount> baAccts = new HashSet<>();
        baAccts.add(ba2);
        baAccts.add(ba1);

        Customer cust = new Customer();
        cust.setDob(Calendar.getInstance());
        cust.setEmail("us@gmail.com" + Math.random());
        cust.setName("Mr JamesBond");
        cust.setBankAccounts(baAccts);

        Role r1 = new Role();
        r1.setName("Employee");

        Role r2 = new Role();
        r2.setName("Finance");

        Role r3 = new Role();
        r3.setName("Finance-Audit");

        roleRepo.save(r1);
        roleRepo.save(r2);
        roleRepo.save(r3);

        List<Role> roles1 = new ArrayList<>();
        roles1.add(r2);
        roles1.add(r1);

        List<Role> roles2 = new ArrayList<>();
        roles2.add(r3);
        roles2.add(r1);

        User u1 = new User();
        u1.setName("user aa");
        u1.setRoles(roles1);

        User u2 = new User();
        u2.setName("user bb");
        u2.setRoles(roles2);

        userManager.save(u2);
        userManager.save(u1);

        // userManager.fetchALL().forEach(System.out::println);
        //custService.save(cust);

        BankAccount tempBa1 = accountRepo.findByAccNbr("00770101011").get(0);
        BankAccount tempBa2 = accountRepo.findByAccNbr("00770101010").get(0);

        System.out.println(tempBa1);
        System.out.println(tempBa2);
        for(int i=0;i<100;i++){
            AccountStatement stmt = new AccountStatement();
            stmt.setBankAccount(tempBa1);
            stmt.setDescription("Txn Ref number.." + i);
            if (i%2==0) {
                stmt.setIsCredit(true);
            } else {
                stmt.setIsCredit(false);
            }
            stmt.setValue(i*100);

            stmtRepo.save(stmt);

            AccountStatement stmt2 = new AccountStatement();
            stmt2.setBankAccount(tempBa2);
            stmt2.setDescription("Txn Ref2 number.." + i);
            if (i%2==0) {
                stmt2.setIsCredit(false);
            } else {
                stmt2.setIsCredit(true);
            }
            stmt2.setValue(i*200);

            stmtRepo.save(stmt2);
        }

        // BankAccount ba1 = new BankAccount();
        // ba1.setAType(aType2);

        PermEmployee pEmployee = new PermEmployee();
        pEmployee.setName("Rajinikanth" + + System.currentTimeMillis());
        pEmployee.setEmpId("1234123" + System.currentTimeMillis());
        pEmployee.setDob(Calendar.getInstance());
        pEmployee.setDept("Finance");
        pEmployee.setBLocation("Chennai");

        ContEmployee cEmp = new ContEmployee();
        cEmp.setContactId("010101010");
        cEmp.setContractType("4M");
        cEmp.setDob(Calendar.getInstance());
        cEmp.setEmpId("C1212121" + System.currentTimeMillis());
        cEmp.setName("ManiBasha" + + System.currentTimeMillis());

        //empManager.save(cEmp);
        //empManager.save(pEmployee);
        System.out.println("==============================");
        
        //empManager.findByName("ManiBasha").forEach(System.out::println);
        //empManager.fetchAll().forEach(System.out::println);

        Lion ln = new Lion();
        ln.setIsCarnivorous(true);
        ln.setKing(true);
        ln.setLocation("LionKing");
        ln.setType("AfricanLion");

        Tiger tgr = new Tiger();
        tgr.setColor("Yellow");
        tgr.setIsCarnivorous(true);
        tgr.setType("Bengal");

        Elephant ele = new Elephant();
        ele.setCountryOfOrgin("India");
        ele.setIsCarnivorous(false);
        ele.setType("Asian");

        //animalRepo.save(ln);
        //animalRepo.save(tgr);
        //animalRepo.save(ele);

        

        //animalRepo.findAll().forEach(System.out::println);

        Book bk1 = new Book();
        bk1.setAuthor("User A");
        bk1.setManuf("McGrawhill");
        bk1.setNoOfPage(100);
        
        //prodRepo.save(bk1);

        for(int i=0;i<100;i++){
            Pen p= new Pen();
            p.setInkColor("red");
            p.setIsGel(false);
            if (i%2==0) {
                p.setInkColor("blue");   
                p.setIsGel(true);
            }
            
            p.setManuf("parker");

            //prodRepo.save(p);
            
        }

        System.out.println("=============================");

        //System.out.println(prodRepo.findById(2535).get());
        custService.fetchJoinData().forEach(x->{
            System.out.println(x.toString());
        });
        
        custService.modifyCust("Red Rose", 13);
    }

}
