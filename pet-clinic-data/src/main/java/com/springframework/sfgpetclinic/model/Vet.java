package com.springframework.sfgpetclinic.model;

//@Entity
//@Table(name = "vet")
public class Vet extends Person {
    public Vet() {
        super();
    }

    //    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
//            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
//    private Set<Specialty> specialties;

}
