package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

@RequestMapping("/getAlien")
public ModelAndView getAlien(@RequestParam int aid) {

  // since ModelAndView is used to transfer data between pages we will be using showAlien.jsp as the view and alien object will store the data for us which we will present once the user clicks the submit button
	ModelAndView mv = new ModelAndView("showAlien.jsp");  // storing the view
	Alien alien = repo.findById(aid).orElse(new Alien()); // fetching the value
	mv.addObject(alien);                                  // adding the fetched value to the mv object
	return mv;                                            // returning the mv object
}
}
