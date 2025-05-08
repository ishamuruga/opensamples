package com.computerx.computerx_api.dto;

import java.util.Calendar;

import lombok.Data;

@Data
public class LoginResponse extends BaseDto {
    public String email;

    public String[] roles;

    public Calendar ts;

    public String accessToken;

    public String refreshToken;

    public String status;
}
