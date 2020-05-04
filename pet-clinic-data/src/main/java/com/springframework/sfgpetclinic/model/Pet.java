package com.springframework.sfgpetclinic.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

public @Data
class Pet extends BaseEntity {

    private LocalDate birthDate;

    private PetType type;

    private Owner owner;

    private Set<Visit> visits;

}
