package com.company.payments.api.paymentsapi.entity.inh;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "tbl_animal")
@DiscriminatorColumn(name = "animal_type",discriminatorType = DiscriminatorType.STRING)
public class Animal {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;

   private Boolean isCarnivorous;

   private String type;
}
