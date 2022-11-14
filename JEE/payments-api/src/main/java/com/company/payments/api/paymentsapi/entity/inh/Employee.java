package com.company.payments.api.paymentsapi.entity.inh;

import java.util.Calendar;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@MappedSuperclass
public class Employee {
    @Id
    private String empId;
    
    private String name;

    private Calendar dob;

}
