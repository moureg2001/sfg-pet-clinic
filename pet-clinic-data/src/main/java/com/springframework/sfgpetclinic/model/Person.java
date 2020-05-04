package com.springframework.sfgpetclinic.model;

import lombok.Data;


public @Data
class Person extends BaseEntity {

    private String firstname;

    private String lastname;

}
