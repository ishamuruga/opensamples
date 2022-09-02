package com.company.payment.api.mypaymentapi.service;

public interface FundTransferManger {
    public String doFundTransfer(String srcAcc,String benAcc, int amount);
    public String getTxnStatys(String txnNo);
}
