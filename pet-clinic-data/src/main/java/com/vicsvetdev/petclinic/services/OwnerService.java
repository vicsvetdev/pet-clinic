package com.vicsvetdev.petclinic.services;

import com.vicsvetdev.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
