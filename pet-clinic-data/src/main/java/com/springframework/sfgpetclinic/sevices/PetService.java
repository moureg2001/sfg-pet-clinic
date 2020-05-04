package com.springframework.sfgpetclinic.sevices;

import com.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByLast(String lastName);

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
