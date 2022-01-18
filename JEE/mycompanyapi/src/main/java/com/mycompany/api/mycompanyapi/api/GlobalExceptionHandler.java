package com.mycompany.api.mycompanyapi.api;

import java.util.Date;

import com.mycompany.api.mycompanyapi.uimodel.ErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(value = {IllegalAccessException.class,RuntimeException.class})
    public ResponseEntity<ErrorResponse> handleException(Exception exp) {
        ErrorResponse err = new ErrorResponse(exp.hashCode(), exp.getMessage(), new Date());
        exp.printStackTrace();
        return new ResponseEntity<ErrorResponse>(err,HttpStatus.BAD_REQUEST);
    }
    
}
