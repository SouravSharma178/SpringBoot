package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
@GetMapping("/clients")
public String fun() {
	return "These are all the Clients";
}
}
