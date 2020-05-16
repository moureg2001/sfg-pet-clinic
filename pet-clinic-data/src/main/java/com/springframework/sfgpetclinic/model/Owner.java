package com.springframework.sfgpetclinic.model;

import lombok.Data;

//@Entity
//@Table(name = "owners")
public @Data
class Owner extends Person {

    private String address;

    private String city;

    private String telephone;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
//    private Set<Pet> pets = new HashSet<>();

}
