package com.company.payments.api.paymentsapi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.company.payments.api.paymentsapi.entity.BankAccount;

@Repository
public interface BankAccountRepo extends JpaRepository<BankAccount,Integer> {
    public List<BankAccount> findByAccNbr(String accountNumber);

    @Query(value = "from BankAccount ba where ba.accNbr=:accountNumber")
    public List<BankAccount> customRecordFetch(String accountNumber);
}
