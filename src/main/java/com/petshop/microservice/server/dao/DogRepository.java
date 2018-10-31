package com.petshop.microservice.server.dao;

import com.petshop.microservice.server.domain.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;


@RestResource(path="dogs", rel="dogs")
public interface DogRepository extends CrudRepository<Dog, Long> {

}
