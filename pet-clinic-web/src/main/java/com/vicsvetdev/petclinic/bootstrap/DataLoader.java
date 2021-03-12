package com.vicsvetdev.petclinic.bootstrap;

import com.vicsvetdev.petclinic.model.Owner;
import com.vicsvetdev.petclinic.model.Vet;
import com.vicsvetdev.petclinic.services.OwnerService;
import com.vicsvetdev.petclinic.services.VetService;
import com.vicsvetdev.petclinic.services.map.OwnerServiceMap;
import com.vicsvetdev.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Scott");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Jim");
        owner2.setLastName("Halpert");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Pam");
        vet1.setLastName("Beasly");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Dwight");
        vet2.setLastName("Schrut");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
