package com.company.payments.api.paymentsapi.entity.inh;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue(value = "TGR")
public class Tiger extends Animal {
    private String color;

    private String type;
}
