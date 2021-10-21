package com.supers.sb.hw.springboothw.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.supers.sb.hw.springboothw.config.MyDataConfig;
import com.supers.sb.hw.springboothw.config.MyDefaultConfig;
import com.supers.sb.hw.springboothw.entity.AccountStatement;
import com.supers.sb.hw.springboothw.entity.BankAccount;
import com.supers.sb.hw.springboothw.entity.BankAccountType;
import com.supers.sb.hw.springboothw.entity.Customer;
import com.supers.sb.hw.springboothw.entity.Role;
import com.supers.sb.hw.springboothw.entity.User;
import com.supers.sb.hw.springboothw.exception.NotAMajorAgeCustomerException;
import com.supers.sb.hw.springboothw.repo.AccountStatementRepo;
import com.supers.sb.hw.springboothw.repo.CustomerRepository;


@Service
@Transactional
public class CustomerManagerImpl implements CustomerManager {
	
	@Autowired
	private MyDefaultConfig myDefCfg;
	
	@Autowired
	private MyDataConfig myDataCfg;
	
	@Autowired
	private CustomerRepository repo;

	
	


	@Override
	public String getCustomers() {
		//
		return "Arunachalam-".concat(myDataCfg.getCustName())  ;
	}

	@Override
	public boolean verifyAge(int age) throws NotAMajorAgeCustomerException {

		if (age < 18) {
			throw new NotAMajorAgeCustomerException("Under Age Customer, Cannot Proceed Futher.");
		}
		
		return true;
	}

	@Override
	public void save(Customer cust) {
		
		List<BankAccount> accounts = new ArrayList<>();
		for(int i=0;i<5;i++) {
			
			BankAccountType bType = new BankAccountType();
			if (i % 2 ==0 ) {
				bType.setDescription("Savings");
			} else {
				bType.setDescription("Current");
			}
			
			BankAccount ba = new BankAccount();
			ba.setBalance((100 * i)+1);
			ba.setBankAcctNbr("ACC" + Math.random() + i);
			ba.setBranchCode("BRANCH00"+i);
			ba.setType(bType);

			

			accounts.add(ba);
		}
		cust.setBankAccounts(accounts);
		
		User usr = new User();
		usr.setUserid("virt1-"+Math.random());
		usr.setEmail("virt1@supers.com");
		usr.setPassword("virt123");
		
		Role r1 = new Role();
		r1.setRoleId("User");
		r1.setDescription("General User");
		
		Role r2 = new Role();
		r2.setRoleId("HRUser");
		r2.setDescription("HR User");
		
		List<Role> roles = new ArrayList<>();
		roles.add(r1);
		roles.add(r2);
		
		usr.setRoles(roles);
		
		
		//uRepo.save(usr);		
		
		repo.save(cust);

	}

	@Override
	public Optional<Customer> fetchCustomerById(int id) {
		
		System.out.println(repo.findByName("rajkumar"));
		System.out.println("==========================");
		return repo.findById(id);
		
	}
//
//	//begintrans
//	public void transferAmount(String srcAcc,String desAcc,int amount){
//		if (debitAccount(srcAcc,amount)) {
//			creidtAccount(desAcc,amount);
//		}
//		
//	}
//	//commit or rollback in case of rt exception
//
//	//begintras
//	public boolean debitAccount(String srcAcc,int amount) {
//		//update Account a set a.balance=a.balace-amount where a.accountnbr = srcACC
//		//int count = repo.update(srcAcc,amount);
//		//if (count>0) {
//	/		return true;
//		} 
//		return false;
//		//commit
//		//if (error){
//		//	rollback
//		//}
//	}
//
//	//begintras
//	public void creidtAccount(String desAcc,int amount) {
//		//update Account a set a.balance=a.balace+amount where a.accountnbr = srcACC
//		//repo.update(desAcc,amount);
//		//commit
//		//commit
//		//if (error){
//		//	rollback
//		//}
//	}

}
