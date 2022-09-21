package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

// here we will just create an interface which will extend the CrudRepository and we will just write the name of the entity class and define the data type of the primary key of our table to store data in the H2 database

public interface AlienRepo extends CrudRepository <Alien,Integer> {

}
