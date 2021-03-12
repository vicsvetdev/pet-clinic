package com.vicsvetdev.petclinic.bootstrap;

import com.vicsvetdev.petclinic.model.Owner;
import com.vicsvetdev.petclinic.model.Vet;
import com.vicsvetdev.petclinic.services.OwnerService;
import com.vicsvetdev.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Scott");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jim");
        owner2.setLastName("Halpert");
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
