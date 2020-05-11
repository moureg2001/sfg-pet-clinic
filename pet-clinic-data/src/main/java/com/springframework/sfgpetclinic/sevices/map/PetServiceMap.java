package com.springframework.sfgpetclinic.sevices.map;

import com.springframework.sfgpetclinic.model.Pet;
import com.springframework.sfgpetclinic.sevices.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService <Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Pet object) {

    }

    @Override
    public Pet save(Pet object) {
        return null;
    }

    @Override
    public Pet findById(Long id) {
        return null;
    }
}
