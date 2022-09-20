package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

@Service 
public class Alien {
    private int aid;
    private String aname;
    private String tech;
// here we are doing autowiring since we want to instantiate the Laptop object inside the Alien class
// by using Autowiring the Alien bean will wire itself to the Laptop bean    
    @Autowired
    private Laptop laptop;
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Alien() {
		super();
		System.out.println("Object created twice (* when using a prototype design pattern *)");
	}
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
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
    void show () {
    	System.out.println("This is the show method");
    	laptop.compile();
    }
}
