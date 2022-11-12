package com.apstore.api.pos.apstoreposapi.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_order")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String orderRefNo;

    private String name;

    private double cost;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar ts;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private List<OrderDetails> orderDetails;
}
