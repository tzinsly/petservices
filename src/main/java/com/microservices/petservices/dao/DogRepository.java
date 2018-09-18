package com.microservices.petservices.dao;

import com.microservices.petservices.domain.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;


@RestResource(path="dogs", rel="dogs")
public interface DogRepository extends CrudRepository<Dog, Long> {

}
