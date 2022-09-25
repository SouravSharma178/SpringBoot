package com.example.demo.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;


@RestController
public class HomeController {

@Autowired
AlienRepo repo;
@RequestMapping("/home")
public String home() {
	
	return "home.jsp";
}
@PostMapping("/alien")
public Alien addAlien(@RequestBody Alien alien) {
	
	repo.save(alien);
	return alien;
}
@PutMapping("/alien")
public Alien saveOrUpdateAlien(@RequestBody Alien alien) {
	
	repo.save(alien);
	return alien;
}

@GetMapping(path= "/aliens")
// since we are using REST here we are going to use @ResponseBody
public List <Alien> getAliens() {
	
// the repo.findAll() is an iterable by default so we need to convert it to a string
return repo.findAll();
}

@RequestMapping("/alien/{aid}")
public Optional <Alien> getAlien(@PathVariable("aid") int aid) {
return repo.findById(aid);
}

@DeleteMapping("/alien/{aid}")
public String deleteAlien(@PathVariable int aid) {
	
	@SuppressWarnings("deprecation")
	Alien a = repo.getOne(aid);
	repo.delete(a);
	return "deleted";
	
}
}
