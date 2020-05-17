package com.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
//@MappedSuperclass
@Setter
@Getter
public class Pet extends NamedEntity {

    private LocalDate birthDate;

    private PetType type;

//    @ManyToOne
//    @JoinColumn(name = "owner_id")
    private Owner owner;

//    private Set<Visit> visits;

}
