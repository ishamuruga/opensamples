package com.company.payment.api.mypaymentapi.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.payment.api.mypaymentapi.exception.InSufficientBalanceException;
import com.company.payment.api.mypaymentapi.model.FundTransferRequest;

import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

@RestController
@RequestMapping("/api")
public class MyHelloWorldController extends BaseController {
    
    @GetMapping(value = "/init")
    public String getNames(){
        String[] names = {"name1","name2","name3"};

        return Arrays.toString(names);
    }

    @GetMapping(value = "/fetch/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FundTransferRequest> fetchFundTransferReq(@PathVariable  int id){
        FundTransferRequest req = new FundTransferRequest(1,"tst",1000);
        req.setAmount(1000);
        req.setBene("Abcd Account");
        req.setId(id);
        return new ResponseEntity<FundTransferRequest>(req,HttpStatus.OK);
    }

    @PostMapping(value = "/fundtransfer",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<FundTransferRequest>> createFundRequest(@RequestBody @Valid FundTransferRequest req) throws InSufficientBalanceException{

        List<FundTransferRequest> res = getFundTransfers();

        res.add(req);

        if (req.getAmount()==1) {
            int j = 8/0;
        } else if (req.getAmount() > 500) {
            throw new InSufficientBalanceException("InValid Balance");
        }

        return new ResponseEntity<List<FundTransferRequest>>(res,HttpStatus.OK);
    }

    @PutMapping(value = "/fundtransfer",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<FundTransferRequest>> updateFundRequest(@RequestBody @Valid FundTransferRequest req) {

        List<FundTransferRequest> res = getFundTransfers();

        List<FundTransferRequest> newList = res.stream().map(x->{
            if (x.getId()==req.getId()) {
                x.setBene(req.getBene());
                x.setAmount(req.getAmount());
            }
            return x;
        }).collect(Collectors.toList());

        return new ResponseEntity<List<FundTransferRequest>>(newList,HttpStatus.OK);
    }


}
