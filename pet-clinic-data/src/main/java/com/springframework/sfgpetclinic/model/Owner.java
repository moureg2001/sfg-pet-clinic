package com.springframework.sfgpetclinic.model;

import lombok.Data;

import java.util.Set;


public @Data
class Owner extends Person {

    private String address;

    private String city;

    private String telephone;

    private Set<Pet> pets;

}
