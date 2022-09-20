package com.example.demo;

import org.springframework.stereotype.Service;

// here we can write service or component to indicate to spring boot that it is a component
@Service
public class Laptop {
    private int lid;
    private String brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	void compile(){
		System.out.println("Compiling from laptop");
	}
    
}
