package com.company.payment.api.mypaymentapi.model;

import java.util.Calendar;

import javax.annotation.Generated;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ErrorPacket extends BaseModel {
    private Calendar ts;

    private String message;

    private String id;

    private String errorCode;

}
