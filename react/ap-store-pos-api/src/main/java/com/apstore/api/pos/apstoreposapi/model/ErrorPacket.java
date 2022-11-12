package com.apstore.api.pos.apstoreposapi.model;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ErrorPacket {
    
    private String message;

    private Calendar ts;

    private String erroCode;
}
