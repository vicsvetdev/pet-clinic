package com.vicsvetdev.petclinic.repositories;

import com.vicsvetdev.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
