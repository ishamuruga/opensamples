package com.computerx.computerx_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Auth extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String email;

    public String password;
}
