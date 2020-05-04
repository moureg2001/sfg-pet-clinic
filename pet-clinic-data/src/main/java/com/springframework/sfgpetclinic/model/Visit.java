package com.springframework.sfgpetclinic.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "visits")
public @Data
class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate date;
    @Column(name = "description")
    private String desc;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
