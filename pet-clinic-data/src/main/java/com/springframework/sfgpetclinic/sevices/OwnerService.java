package com.springframework.sfgpetclinic.sevices;

import com.springframework.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLast(String lastName);

}
