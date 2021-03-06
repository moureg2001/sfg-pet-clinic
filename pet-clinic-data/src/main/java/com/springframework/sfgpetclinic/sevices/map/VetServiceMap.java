package com.springframework.sfgpetclinic.sevices.map;

import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.sevices.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {



    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet findByLast(String lastName) {
        return null;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
}
