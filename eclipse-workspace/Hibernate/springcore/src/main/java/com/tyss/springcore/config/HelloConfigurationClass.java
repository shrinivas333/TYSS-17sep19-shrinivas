package com.tyss.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.tyss.springcore.di.Animal;
import com.tyss.springcore.di.Cat;
import com.tyss.springcore.di.Dog;
import com.tyss.springcore.di.Hello;
import com.tyss.springcore.di.Pet;

@Configuration
@Import(PetConfiguration.class)
public class HelloConfigurationClass {

	@Bean(name = "hello")
//	@Scope("prototype")
	public Hello  getHello() {
		Hello hello=new Hello();
		hello.setMsg("I Love Python");
		
		return hello;
		
	}
	
}
