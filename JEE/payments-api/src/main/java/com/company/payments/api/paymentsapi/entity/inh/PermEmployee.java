package com.company.payments.api.paymentsapi.entity.inh;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tbl_permanent_employee")
public class PermEmployee extends Employee {
    private String dept;

    private String bLocation;
}
