package com.microservices.petservices.dao;

import com.microservices.petservices.domain.PetShop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(path="pets", rel="pets")
public interface PetShopRepository extends CrudRepository<PetShop, Long> {

    List<PetShop> findAll();
    PetShop findByName(String name);

}
