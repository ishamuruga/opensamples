package com.mycompany.mybankapi.api;

import java.util.Date;

import com.mycompany.mybankapi.exceptions.UnderAgeStudentException;
import com.mycompany.mybankapi.model.ErrorPL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    
    @ExceptionHandler(value = IllegalAccessException.class)
    public ResponseEntity<ErrorPL> handleException(Exception th) {
        ErrorPL ePl = new ErrorPL();
        ePl.setId(1);
        ePl.setMessage(th.getMessage());
        ePl.setTs(new Date());

        //th.printStackTrace();

        logger.error("Error", th);

        return new ResponseEntity<>(ePl,HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(value = UnderAgeStudentException.class)
    public ResponseEntity<ErrorPL> handleUAException(Exception th) {
        ErrorPL ePl = new ErrorPL();
        ePl.setId(99);
        ePl.setMessage(th.getMessage());
        ePl.setTs(new Date());


        logger.error("Error", th);
        return new ResponseEntity<>(ePl,HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorPL> handleRTException(Exception th) {
        ErrorPL ePl = new ErrorPL();
        ePl.setId(1);
        ePl.setMessage("Pleae contact your adminstrator");
        ePl.setTs(new Date());
        //th.printStackTrace();
        logger.error("Error", th);
        return new ResponseEntity<>(ePl,HttpStatus.BAD_GATEWAY);

    }
    
}
