package com.vicsvetdev.petclinic.repositories;

import com.vicsvetdev.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
