package com.company.payment.paymentapi.api;

import java.util.Calendar;
import java.util.UUID;

import com.company.payment.paymentapi.exception.CustomerInvalidException;
import com.company.payment.paymentapi.exception.SomeOtherException;
import com.company.payment.paymentapi.uimodel.ErrorDetails;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalErrorHandler extends BaseController {

    Logger logger = LoggerFactory.getLogger(GlobalErrorHandler.class);
    
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ErrorDetails> handleIlleAccessException(Throwable th){
        String mess = "SYS-ERR001-" + UUID.randomUUID();
        ErrorDetails err = new ErrorDetails();
        err.setErrorMessage("System Error has occured");
        err.setErrCode(mess);
        err.setTs(Calendar.getInstance());

        logger.error(mess, th);

        return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_GATEWAY);
    }

    @ExceptionHandler(value = {CustomerInvalidException.class,SomeOtherException.class})
    public ResponseEntity<ErrorDetails> handleCustomerInvalidException(Throwable th){
        ErrorDetails err = new ErrorDetails();
        err.setErrorMessage(th.getMessage());
        err.setErrCode("BUS-ERR002");
        err.setTs(Calendar.getInstance());

        logger.error(th.getMessage(), th);

        return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);
    }
}
