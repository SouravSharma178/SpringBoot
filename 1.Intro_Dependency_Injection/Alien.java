package com.example.demo;
import org.springframework.stereotype.Component;

// the moment we write @Component it is a spring bean and we can use it anywhere
@Component
public class Alien {
    private int aid;
    private String aname;
    private String tech;
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
    }
}
