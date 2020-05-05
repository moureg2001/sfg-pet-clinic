package com.springframework.sfgpetclinic.sevices;

import com.springframework.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long> {

    Vet findByLast(String lastName);

}
