package com.company.payment.api.mypaymentapi.service;

import java.util.UUID;

import org.springframework.stereotype.Service;


@Service
public class FundTransferManagerImpl implements FundTransferManger{

    @Override
    public String doFundTransfer(String srcAcc, String benAcc, int amount) {
        return UUID.randomUUID().toString();
    }

    @Override
    public String getTxnStatys(String txnNo) {
        return "Status-" + System.currentTimeMillis();
    }
    
}
