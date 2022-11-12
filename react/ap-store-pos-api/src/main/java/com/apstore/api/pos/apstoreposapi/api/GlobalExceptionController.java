package com.apstore.api.pos.apstoreposapi.api;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.apstore.api.pos.apstoreposapi.config.ErrorConfig;
import com.apstore.api.pos.apstoreposapi.model.ErrorPacket;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionController extends ResponseEntityExceptionHandler {

    @Autowired
    private ErrorConfig errCfg;
    
    @ExceptionHandler(value = { Exception.class })
    protected ResponseEntity<ErrorPacket> handleConflict(
            RuntimeException ex, WebRequest request) {
        
            ErrorPacket eP= new ErrorPacket();
            eP.setErroCode("err001");
            eP.setMessage(errCfg.getErrMap().get("err001"));
            eP.setTs(Calendar.getInstance());
            log.error(PAGE_NOT_FOUND_LOG_CATEGORY, ex);
            //ex.printStackTrace();
            return new ResponseEntity<ErrorPacket>(eP,HttpStatus.BAD_REQUEST);

    }
}
