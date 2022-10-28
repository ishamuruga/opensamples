package com.company.payments.api.paymentsapi.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerResponse extends BaseResponse{

    //@Min(value = 2,message = "Name Cannot be less than 2")
    private int id;

    // @NotBlank(message="name is mandatory")
    // @Max(value = 10,message = "Name Cannot be more than 10")
    // @Min(value = 2,message = "Name Cannot be less than 2")
    private String name;

    public CustomerResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
