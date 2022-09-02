package com.company.payment.api.mypaymentapi.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.jmx.export.annotation.ManagedAttribute;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToMany(fetch =  FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "user_with_role",
        joinColumns = {@JoinColumn(name="user_id",referencedColumnName="id")},
        inverseJoinColumns = {@JoinColumn(name="role_id",referencedColumnName="id")},
         uniqueConstraints = @UniqueConstraint(columnNames = {
            "user_id","role_id"
         })
    )
    private List<Role> roles;


}
