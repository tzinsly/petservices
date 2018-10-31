package com.petshop.microservice.server.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Dog {

    @Id @GeneratedValue
    Long id;
    String breed;
    String size;
    String color;
    int age;

    public Dog(){
        super();
    }

    public Dog(String breed, String size, String color, int age) {
        this();
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
