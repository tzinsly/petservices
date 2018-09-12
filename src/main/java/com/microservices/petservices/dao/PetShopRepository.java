package com.microservices.petservices.dao;

import com.microservices.petservices.domain.PetShop;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PetShopRepository extends CrudRepository<PetShop, Long> {

    List<PetShop> findAll();
    PetShop findByName(String name);

}
