package com.company.reactive.api.springreactiveapi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("users")
public class User {
    @Id
    private Integer id;
    private String name;
    private int age;
    private double salary;
}
