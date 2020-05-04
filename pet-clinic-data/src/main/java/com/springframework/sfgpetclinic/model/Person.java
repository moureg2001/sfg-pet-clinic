package com.springframework.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.*;

@Entity
public @Data
class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

}
