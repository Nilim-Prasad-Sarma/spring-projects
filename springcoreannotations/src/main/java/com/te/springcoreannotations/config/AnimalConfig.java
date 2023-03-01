package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotations.pojo.Animal;
import com.te.springcoreannotations.pojo.Cat;
import com.te.springcoreannotations.pojo.Dog;

@Configuration
public class AnimalConfig {

	@Bean("dog")
	@Primary
	public Animal getDog() {
		return new Dog();
	}
	
	@Bean("cat")
	public Animal getCat() {
		return new Cat();
	}
}
