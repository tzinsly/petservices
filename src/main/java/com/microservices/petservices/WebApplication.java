package com.microservices.petservices;

import com.microservices.petservices.dao.PetShopRepository;
import com.microservices.petservices.domain.Dog;
import com.microservices.petservices.domain.PetShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
/**
 * @SpringBootApplication - the same of @Configuration, @Enable...
 */

public class WebApplication {
	@Autowired
	PetShopRepository petShopRepository;

	/**
	 *
	 * @param args
	 * This way is used to run using JAR
	 */
	public static void main(String[] args) {
		/**
		 * Inside the method call "run()", you need to tell from where your configuration comes from
		 * DemoApplication is not only the class where the main method runs, but also will contain any extra
		 * configuration information that we need to create
		 */
		SpringApplication.run(WebApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(WebApplication.class);
	}

	@PostConstruct
	public void init(){

		Dog doge1, doge2, doge3, doge4, doge5;
		PetShop pet1, pet2;

		doge1 = new Dog("Beagle", "Small", "Orange", 6);
		doge2 = new Dog("Bulldog", "Medium", "Light gray", 5);
		doge3 = new Dog("German Shepherd", "Large", "White", 7);

		doge4 = new Dog("Pinscher", "Small", "Black", 13);
		doge5 = new Dog("Akita", "Medium", "Yellow", 11);

		Set<Dog> dogs = new HashSet<>();

		dogs.add(doge1);
		dogs.add(doge2);
		dogs.add(doge3);

		pet1 = new PetShop("PetVet", "Rua Blabla", dogs);

		Set<Dog> dogs2 = new HashSet<>();
		dogs2.add(doge4);
		dogs2.add(doge5);

		pet2 = new PetShop("PetFil", "Rua XV de Novembro", dogs2);

		List<PetShop> pets = new ArrayList<PetShop>();
		pets.add(pet1);
		pets.add(pet2);
		petShopRepository.save(pets);
	}


}
