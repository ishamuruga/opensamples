package com.company.payment.api.mypaymentapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest extends BaseModel {
    
    private String username;

    private String password;
}
