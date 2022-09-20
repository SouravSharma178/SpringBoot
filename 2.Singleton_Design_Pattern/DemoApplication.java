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
		
// by default spring uses a singleton design pattern which means that the object of Alien will be created even if we do not write getBean
// it must be also noted that if we are using a singleton design pattern the object is created only once no matter how many instances we make eg a,a1,a2.....
Alien a = context.getBean(Alien.class);
a.show();
Alien a1 = context.getBean(Alien.class);
a1.show();	
}}
