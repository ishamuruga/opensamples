package com.computerx.computerx_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginRequest extends BaseDto {

    @NotNull
    @NotBlank
    public String email;

    @NotNull
    @NotBlank
    public String password;
}
