package com.example.client2.controller;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
@RestController
public class HomeController2 {
@RequestMapping("/client-2") 
public String msgClient2() {
return "I am Client2"; }
}
