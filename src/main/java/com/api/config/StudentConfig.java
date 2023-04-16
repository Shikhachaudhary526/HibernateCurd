package com.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api.model.Person;

@Configuration
public class StudentConfig {
	
	@Bean
	public void studentFactory() {
		System.out.println("Configuration class called");
	}
	
//	public Person getPerson() {
//		Person person = new Person();
//		person.setName("Shikha");
//		System.out.println("called person");
//		return person;
//		
//	}  kaise hua. Vo phle bhee chal raha tha. Bss output isliye nahi dikh raha tha qki tum dusri class run kara rahi thee

}
