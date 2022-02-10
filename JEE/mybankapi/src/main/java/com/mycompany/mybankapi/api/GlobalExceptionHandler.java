package com.mycompany.mybankapi.api;

import java.util.Date;

import com.mycompany.mybankapi.exceptions.UnderAgeStudentException;
import com.mycompany.mybankapi.model.ErrorPL;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(value = IllegalAccessException.class)
    public ResponseEntity<ErrorPL> handleException(Exception th) {
        ErrorPL ePl = new ErrorPL();
        ePl.setId(1);
        ePl.setMessage(th.getMessage());
        ePl.setTs(new Date());

        th.printStackTrace();
        return new ResponseEntity<>(ePl,HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(value = UnderAgeStudentException.class)
    public ResponseEntity<ErrorPL> handleUAException(Exception th) {
        ErrorPL ePl = new ErrorPL();
        ePl.setId(99);
        ePl.setMessage(th.getMessage());
        ePl.setTs(new Date());

        th.printStackTrace();
        return new ResponseEntity<>(ePl,HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorPL> handleRTException(Exception th) {
        ErrorPL ePl = new ErrorPL();
        ePl.setId(1);
        ePl.setMessage("Pleae contact your adminstrator");
        ePl.setTs(new Date());
        th.printStackTrace();
        return new ResponseEntity<>(ePl,HttpStatus.BAD_GATEWAY);

    }
    
}
