package com.company.payment.api.mypaymentapi.entity.inheritance;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@PrimaryKeyJoinColumn(name = "orderId")
public class MobileOrder  extends MyOrder {
    private String mobileNumber;

    private String location;
}
