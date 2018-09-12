package com.microservices.petservices.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement
@Entity
public class PetShop {

    @Id @GeneratedValue
    Long idPet;
    String name;
    String address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPet")
    Set<Dog> dogs;

    public PetShop() {
        super();
    }

    public PetShop(String name, String address, Set<Dog> dogs) {
        this();
        this.name = name;
        this.address = address;
        this.dogs = dogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }
}
