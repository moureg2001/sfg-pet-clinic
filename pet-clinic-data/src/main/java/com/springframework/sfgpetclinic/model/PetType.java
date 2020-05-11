package com.springframework.sfgpetclinic.model;

import lombok.Data;

public @Data
class PetType extends BaseEntity{

    private String name;

    public PetType(String name) {
        this.name = name;
    }

}
