package com.vicsvetdev.petclinic.repositories;

import com.vicsvetdev.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
