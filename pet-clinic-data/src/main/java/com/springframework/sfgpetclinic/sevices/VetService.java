package com.springframework.sfgpetclinic.sevices;

import com.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLast(String lastName);

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
