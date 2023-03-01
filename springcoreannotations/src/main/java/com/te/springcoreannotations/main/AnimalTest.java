package com.te.springcoreannotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.config.PetConfig;
import com.te.springcoreannotations.pojo.Pet;

public class AnimalTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
		Pet pet = (Pet) context.getBean("pet1");
		System.out.println(pet.getPetName());
		pet.getAnimal().eat();
		pet.getAnimal().speak();

	}
}
