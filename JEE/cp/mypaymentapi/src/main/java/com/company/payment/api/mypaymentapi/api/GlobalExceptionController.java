package com.company.payment.api.mypaymentapi.api;

import java.util.Calendar;
import java.util.UUID;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.company.payment.api.mypaymentapi.exception.FDCreationException;
import com.company.payment.api.mypaymentapi.exception.FundTransferFailureException;
import com.company.payment.api.mypaymentapi.model.ErrorPacket;

@ControllerAdvice
public class GlobalExceptionController extends ResponseEntityExceptionHandler {
    
    Logger logger = LoggerFactory.getLogger(GlobalExceptionController.class);

    @ExceptionHandler(value = {RuntimeException.class})
    public ResponseEntity<ErrorPacket> handleRunTimeException(Exception ex){

        ErrorPacket ep = new ErrorPacket();
        ep.setErrorCode("ERR001");
        ep.setTs(Calendar.getInstance());
        ep.setId(UUID.randomUUID().toString());
        ep.setMessage("System Down, Please Contact your administrator");


        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        

        logger.error(ex.getMessage(), ex);

        return new ResponseEntity<ErrorPacket>(ep, HttpStatus.BAD_GATEWAY);
    }

    @ExceptionHandler(value = {FundTransferFailureException.class,FDCreationException.class})
    public ResponseEntity<ErrorPacket> handleCheckedException(Exception ex){

        ErrorPacket ep = new ErrorPacket();
        ep.setErrorCode("ERR002");
        ep.setTs(Calendar.getInstance());
        ep.setId(UUID.randomUUID().toString());
        ep.setMessage(ex.getMessage());

        System.out.println(ep.toString());

        logger.error(ex.getMessage(), ex);

        return new ResponseEntity<ErrorPacket>(ep, HttpStatus.BAD_REQUEST);
    }
}
