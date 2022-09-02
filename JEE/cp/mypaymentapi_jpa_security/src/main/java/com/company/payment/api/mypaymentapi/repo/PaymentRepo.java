package com.company.payment.api.mypaymentapi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.company.payment.api.mypaymentapi.entity.inheritance.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {

    @Query(value="from com.company.payment.api.mypaymentapi.entity.inheritance.Payment p")
    public List<Payment> getPayments();

    @Query(value="from com.company.payment.api.mypaymentapi.entity.inheritance.Payment p where p.amount>:amount")
    public List<Payment> getPaymentsById(int amount);
    
}
