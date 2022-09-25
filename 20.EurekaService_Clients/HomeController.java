package com.example.client1.controller;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.client.RestTemplate; 

@RestController
public class HomeController {
@RequestMapping("/client") 
public String msgClient1() {
return "I am client1!"; 
}
@GetMapping("/client2") 
public String callClient2() {
String uri = "http://localhost:8082/client";
RestTemplate rest_template = new RestTemplate();
String result = rest_template.getForObject(uri,String.class);
return result;
} 
}
