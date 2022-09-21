package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


// @Entity means this is the the data members of this class will become the columns of the table
@Entity
public class Alien {

// @Id means that this will be the primary key of the table  
@Id	
private int aid;
private String aname;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + "]";
}

}
