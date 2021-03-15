package com.vicsvetdev.petclinic.repositories;

import com.vicsvetdev.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
