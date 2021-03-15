package com.vicsvetdev.petclinic.repositories;

import com.vicsvetdev.petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
