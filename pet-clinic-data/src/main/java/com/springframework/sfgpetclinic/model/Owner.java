package com.springframework.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Entity
public @Data
class Owner extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    private String city;

    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets;

}
