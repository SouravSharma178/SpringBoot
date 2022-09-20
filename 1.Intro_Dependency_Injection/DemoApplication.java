package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

public static void main(String[] args) {	
// this is where the Spring bean gets initialized and in the container named 'context' all the objects are created	
// but the question is which objects will be created?
// now if we have a vast number of classes and if we want to decide objects of which class are to be created then we must write @Component over the class we want the object of		
ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
Alien a = context.getBean(Alien.class);
a.show();
	
	
}}
