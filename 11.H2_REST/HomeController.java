package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;


import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;


@Controller
public class HomeController {

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

@RequestMapping("/aliens")
@ResponseBody
// since we are using REST here we are going to use @ResponseBody
public String getAliens() {
	
// the repo.findAll() is an iterable by default so we need to convert it to a string
return repo.findAll().toString();
}
}

