package com.company.payment.api.mypaymentapi.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest extends BaseModel {
    private String username;

    private String password;

    private List<String> roles;
}
