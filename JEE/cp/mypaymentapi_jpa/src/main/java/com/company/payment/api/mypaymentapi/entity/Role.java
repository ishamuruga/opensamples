package com.company.payment.api.mypaymentapi.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "role")
@Getter
@Setter
@NoArgsConstructor
public class Role {
    
    @Override
    public String toString() {
        return "Role [id=" + id + ", role=" + role + "]";
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Role(int id, String role) {
        this.id = id;
        this.role = role;
    }

    private String role;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
    private List<User> users;
    

}
