package com.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class BaseEntity implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
