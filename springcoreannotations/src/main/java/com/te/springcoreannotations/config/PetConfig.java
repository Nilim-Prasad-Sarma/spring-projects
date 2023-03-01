package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotations.pojo.Animal;
import com.te.springcoreannotations.pojo.Cat;
import com.te.springcoreannotations.pojo.Dog;
import com.te.springcoreannotations.pojo.Pet;

@Configuration
@Import({AnimalConfig.class})
public class PetConfig {


	@Bean("pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setPetName("Jerry");
		pet.setAnimal(getCat());
		return pet;
	}
	
	@Bean("pet1")
	public Pet getPet1() {
		Pet pet = new Pet();
		pet.setPetName("Tom");
		pet.setAnimal(getDog());
		return pet;
	}
	
	@Bean
	@Primary
	public Animal getDog() {
		return new Dog();
	}
	
	@Bean
	public Animal getCat() {
		return new Cat();
	}
}
