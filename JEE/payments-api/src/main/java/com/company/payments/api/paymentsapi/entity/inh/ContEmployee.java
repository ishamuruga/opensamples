package com.company.payments.api.paymentsapi.entity.inh;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name = "tbl_contract_employee")
public class ContEmployee extends Employee {
    private String contactId;

    private String contractType;
}
