package com.microservices.petservices.controller;

import com.microservices.petservices.dao.PetShopRepository;
import com.microservices.petservices.domain.Dog;
import com.microservices.petservices.domain.PetShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Set;

//import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DogsController {

    @Autowired
    PetShopRepository petShopRepository;

    @RequestMapping("/pets")
    @ResponseBody
    public List<PetShop> returnPets(){
        return petShopRepository.findAll();
    }

    @RequestMapping("/pets/{name}")
    @ResponseBody
    public PetShop returnPetsByName(@PathVariable String name){
        return petShopRepository.findByName(name);
    }

    @RequestMapping("/pets/{name}/dogs")
    @ResponseBody
    public Set<Dog> returnDogsForASpecificPet(@PathVariable String name){
        return petShopRepository.findByName(name).getDogs();
    }
}