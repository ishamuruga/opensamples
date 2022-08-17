package com.company.payment.api.mypaymentapi.api;

import java.util.List;

import com.company.payment.api.mypaymentapi.model.FundTransferRequest;

import java.util.ArrayList;

public abstract class BaseController {
    public List<FundTransferRequest> getFundTransfers() {
        List<FundTransferRequest> res = new ArrayList<>();

        res.add(new FundTransferRequest(2, "person1", 100));

        res.add(new FundTransferRequest(3, "person2", 122));

        res.add(new FundTransferRequest(4, "person4", 155));

        return res;
    }
}
