package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class Rest_Controller {
@GetMapping("")
public String login() {
	return "Welcome Admin";
}
@GetMapping("/getMsg")
public String greeting() {
	return "spring-security-example";
}
}
