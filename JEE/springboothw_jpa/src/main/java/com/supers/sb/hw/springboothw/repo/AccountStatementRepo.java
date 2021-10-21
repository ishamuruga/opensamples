package com.supers.sb.hw.springboothw.repo;

import java.util.List;

import com.supers.sb.hw.springboothw.entity.AccountStatement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountStatementRepo extends JpaRepository<AccountStatement,Integer> {
    
    @Query(value = "select ast1 from AccountStatement as ast1 where ast1.bAccount.bankAcctNbr=?1")
    //@Query(value = "select  from Customer as c left join c.bankAccounts as ba")on ba.bankAcctNbr=as.bAccount.bankAcctNbr
    // left join BankAccount ba
	public List<AccountStatement> custom12manyjoin(String number);
}
