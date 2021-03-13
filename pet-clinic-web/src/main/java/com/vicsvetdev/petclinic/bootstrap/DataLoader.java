package com.vicsvetdev.petclinic.bootstrap;

import com.vicsvetdev.petclinic.model.Owner;
import com.vicsvetdev.petclinic.model.Pet;
import com.vicsvetdev.petclinic.model.PetType;
import com.vicsvetdev.petclinic.model.Vet;
import com.vicsvetdev.petclinic.services.OwnerService;
import com.vicsvetdev.petclinic.services.PetTypeService;
import com.vicsvetdev.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService,
                      VetService vetService,
                      PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Scott");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("123123123123");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jim");
        owner2.setLastName("Halpert");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("123123123123");

        Pet jimsCat = new Pet();
        jimsCat.setPetType(savedCatPetType);
        jimsCat.setOwner(owner2);
        jimsCat.setBirthDate(LocalDate.now());
        jimsCat.setName("Oleg");
        owner2.getPets().add(jimsCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Pam");
        vet1.setLastName("Beasly");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Dwight");
        vet2.setLastName("Schrut");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
