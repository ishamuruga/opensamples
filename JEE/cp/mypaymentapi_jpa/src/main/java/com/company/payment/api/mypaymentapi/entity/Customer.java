package com.company.payment.api.mypaymentapi.entity;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy.Eager;

@Entity
@Table(name="tbl_customer")
@Getter
@Setter
@ToString
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int custId;

    @Column(name="custname")
    private String name;
    
    @Column(unique = true)
    private String email;
    
    @JsonFormat(pattern = "dd-mm-yyyy")
    @Temporal(TemporalType.DATE)
    private Calendar dob;
    
    @JsonFormat(pattern = "dd-mm-yyyy hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar ts;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "custid")
    private Set<Account> accounts;

    // @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    // @JoinColumn(name = "custid")
    // private Set<Address> addresses;
}
