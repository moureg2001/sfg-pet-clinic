package com.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

//@MappedSuperclass
@Setter
@Getter
public class NamedEntity extends BaseEntity {

    private String name;

    public NamedEntity() {
    }

    public NamedEntity(String name) {
        this.name = name;
    }

}
