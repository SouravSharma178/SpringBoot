package com.example.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

import java.util.List;

public interface AlienRepo extends CrudRepository <Alien,Integer> {

// the method name here should start by findByNameofthePropertyInCapitalLetter
	List <Alien>findByTech(String tech);
	List <Alien>findByAidGreaterThan(int aid);
// this is the code to create a custom query	
	@Query("from Alien where tech=?1 order by aname")
	List <Alien>findByTechSorted(String tech);
}
