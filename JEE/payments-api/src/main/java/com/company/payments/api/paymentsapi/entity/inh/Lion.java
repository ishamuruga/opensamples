package com.company.payments.api.paymentsapi.entity.inh;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue(value = "LN")
public class Lion extends Animal {
    private boolean isKing;

    private String location;
}
