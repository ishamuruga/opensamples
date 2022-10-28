package com.company.payments.api.paymentsapi.dto;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ErrorPacket extends BaseResponse{
    
    private int id;
    private String message;
    private Calendar ts;
    private String err_code;
}
