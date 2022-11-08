package com.company.payments.api.paymentsapi.api.global;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.company.payments.api.paymentsapi.config.MySpecialConfig;
import com.company.payments.api.paymentsapi.dto.ErrorPacket;

@ControllerAdvice
public class GlobalExceptionalHandler extends ResponseEntityExceptionHandler {
    @Autowired
    private MySpecialConfig specialCfg;
    
    @ExceptionHandler({Exception.class})
    public ResponseEntity<ErrorPacket>  handleRTErrors(Exception ex, WebRequest webreq){
        ErrorPacket ep = new ErrorPacket();
        ep.setErr_code("ERR".concat(Math.random()+""));
        ep.setMessage(specialCfg.getErrMap().get("err006"));
        ep.setTs(Calendar.getInstance());
        ep.setId(1);

        System.err.println(ex.getMessage());
        ex.printStackTrace();
        return new ResponseEntity<ErrorPacket>(ep, HttpStatus.BAD_GATEWAY);
    }
}
