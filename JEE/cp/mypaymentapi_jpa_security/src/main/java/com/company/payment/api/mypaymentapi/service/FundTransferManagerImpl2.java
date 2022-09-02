package com.company.payment.api.mypaymentapi.service;

import java.util.UUID;

import org.springframework.stereotype.Service;


@Service
public class FundTransferManagerImpl2 implements FundTransferManger{

    @Override
    public String doFundTransfer(String srcAcc, String benAcc, int amount) {
        return "B2" + UUID.randomUUID().toString();
    }

    @Override
    public String getTxnStatys(String txnNo) {
        return "B2 - Status-" + System.currentTimeMillis();
    }
    
}
