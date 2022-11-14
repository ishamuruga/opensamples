package com.company.payments.api.paymentsapi.entity.inh;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "tbl_product_pen")
@PrimaryKeyJoinColumn(name="prodId")
public class Pen extends Product {
    private String inkColor;

    private Boolean isGel;
}
