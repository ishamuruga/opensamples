package com.company.payments.api.paymentsapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.company.payments.api.paymentsapi.entity.Customer;
import com.company.payments.api.paymentsapi.entity.CustomerJoin;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    //jpql
    @Query(value = "select new com.company.payments.api.paymentsapi.entity.CustomerJoin(c.id,c.name,c.email,c.dob,ba.accNbr,ba.balance) from Customer c left outer join c.bankAccounts ba")
    public List<CustomerJoin> getAccountsFromCustomerObj();

    @Modifying
    @Query("update Customer c set c.name=:value where c.id=:id")
    public void updateCustomer(String value,Integer id);
}
