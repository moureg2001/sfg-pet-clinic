package com.springframework.sfgpetclinic.bootstrap;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.model.Pet;
import com.springframework.sfgpetclinic.model.PetType;
import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.sevices.OwnerService;
import com.springframework.sfgpetclinic.sevices.PetService;
import com.springframework.sfgpetclinic.sevices.VetService;
import com.springframework.sfgpetclinic.sevices.map.OwnerServiceMap;
import com.springframework.sfgpetclinic.sevices.map.PetServiceMap;
import com.springframework.sfgpetclinic.sevices.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;

    public DataLoader() {
        petService = new PetServiceMap();
        ownerService= new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstname("Hafsah");
        owner1.setLastname("Regragui");
        owner1.setAddress("Schubertstraße 24");
        owner1.setCity("Dortmund");
        owner1.setTelephone("00492319999999");
        ownerService.save(owner1);
        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstname("Nusaibah");
        owner2.setLastname("Regragui");
        owner2.setAddress("Schubertstraße 24");
        owner2.setCity("Dortmund");
        owner2.setTelephone("0049231111111");
        ownerService.save(owner2);
        System.out.println("Loaded Owner Data ...");
        Vet vet1=new Vet();
        vet1.setId(1L);
        vet1.setFirstname("Max");
        vet1.setLastname("Musterman");
        vetService.save(vet1);
        Vet vet2=new Vet();
        vet2.setId(2L);
        vet2.setFirstname("Min");
        vet2.setLastname("Musterman");
        vetService.save(vet2);
        System.out.println("Loaded Vet Data ...");
        Pet pet1=new Pet();
        pet1.setId(1L);
        pet1.setBirthDate(LocalDate.of(2018,02,11));
        pet1.setType(new PetType("Bird"));
        petService.save(pet1);
        System.out.println("Loaded Vet Data ...");
        Pet pet2=new Pet();
        pet1.setId(2L);
        pet1.setBirthDate(LocalDate.of(2019,01,01));
        pet1.setType(new PetType("Bird"));
        petService.save(pet2);
        System.out.println("Loaded Pet Data ...");
    }
}
