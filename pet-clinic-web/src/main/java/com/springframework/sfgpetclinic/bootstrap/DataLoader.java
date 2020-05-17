package com.springframework.sfgpetclinic.bootstrap;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.model.Pet;
import com.springframework.sfgpetclinic.model.PetType;
import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.sevices.OwnerService;
import com.springframework.sfgpetclinic.sevices.PetService;
import com.springframework.sfgpetclinic.sevices.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
//        owner1.setId(1L);
        owner1.setFirstname("Hafsah");
        owner1.setLastname("Regragui");
        owner1.setAddress("Schubertstraße 24");
        owner1.setCity("Dortmund");
        owner1.setTelephone("00492319999999");
        ownerService.save(owner1);
        Owner owner2=new Owner();
//        owner2.setId(2L);
        owner2.setFirstname("Nusaibah");
        owner2.setLastname("Regragui");
        owner2.setAddress("Schubertstraße 24");
        owner2.setCity("Dortmund");
        owner2.setTelephone("0049231111111");
        ownerService.save(owner2);
        Owner owner3=new Owner();
//        owner3.setId(3L);
        owner3.setFirstname("Mouad");
        owner3.setLastname("Regragui");
        owner3.setAddress("Schubertstraße 24");
        owner3.setCity("Dortmund");
        owner3.setTelephone("004917601010101");
        ownerService.save(owner3);
        System.out.println("Loaded Owner Data ...");

        Vet vet1 = new Vet();
//        vet1.setId(1L);
        vet1.setFirstname("Max");
        vet1.setLastname("Musterman");
        vetService.save(vet1);

        Vet vet2=new Vet();
//        vet2.setId(2L);
        vet2.setFirstname("Min");
        vet2.setLastname("Muster");
        vetService.save(vet2);
        
        Vet vet3=new Vet();
//        vet3.setId(3L);
        vet3.setFirstname("Maxim");
        vet3.setLastname("Mustermini");
        vetService.save(vet3);
        System.out.println("Loaded Vet Data ...");

        PetType petType1=new PetType();
        petType1.setName("Bird");
        PetType petType2=new PetType();
        petType2.setName("Cat");

        Pet pet1=new Pet();
//        pet1.setId(10L);
        pet1.setName("Cani");
        pet1.setBirthDate(LocalDate.of(2018, Month.FEBRUARY,11));
        pet1.setType(petType1);
        pet1.setOwner(owner1);
        petService.save(pet1);
        Pet pet2=new Pet();
//        pet1.setId(20L);
        pet2.setName("minu");
        pet2.setBirthDate(LocalDate.of(2019,Month.JANUARY,01));
        pet2.setType(petType2);
        pet2.setOwner(owner2);
        petService.save(pet2);
        System.out.println("Loaded Pet Data ...");
    }
}
