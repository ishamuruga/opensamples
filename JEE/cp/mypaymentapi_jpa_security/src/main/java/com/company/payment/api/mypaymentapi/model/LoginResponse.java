package com.company.payment.api.mypaymentapi.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
    private String username;

    private List<String> roles;

    private String aToken;

    private String rToken;
}
