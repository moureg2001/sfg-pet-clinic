package com.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

//@MappedSuperclass
@Setter
@Getter
public class Person extends BaseEntity {

    private String firstname;
    private String lastname;

    public Person() {
    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
