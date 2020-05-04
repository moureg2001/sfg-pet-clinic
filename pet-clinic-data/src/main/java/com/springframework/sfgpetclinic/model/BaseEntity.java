package com.springframework.sfgpetclinic.model;

import lombok.Data;

import java.io.Serializable;

public @Data
class BaseEntity implements Serializable {
    private Long id;
}
