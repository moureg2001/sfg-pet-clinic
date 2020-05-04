package com.springframework.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;


public @Data
class Visit {


    private LocalDate date;

    @Column(name = "description")
    private String desc;

    private Pet pet;
}
