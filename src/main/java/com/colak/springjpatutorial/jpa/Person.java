package com.colak.springjpatutorial.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    private Long id;

    private String personName;
}
