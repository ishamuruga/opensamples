package com.company.payments.api.paymentsapi.entity.inh;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@DiscriminatorValue(value = "ELE")
public class Elephant extends Animal {
    private String countryOfOrgin;
}
