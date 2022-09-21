package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;


@Controller
public class HomeController {

// using @Autowired	annotation we will simply tie the HomeController bean to the AlienRepo bean and this repo is going to call the save method which will store all the data inside the database using the object of class Alien (which we defined as Entity)
@Autowired
AlienRepo repo;
@RequestMapping("/home")
public String home() {
	
	return "home.jsp";
}
@RequestMapping("/addAlien")
public String addAlien(Alien alien) {
	
	repo.save(alien);
	return "home.jsp";
}
}
