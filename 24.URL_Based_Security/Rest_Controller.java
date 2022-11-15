package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Rest_Controller {
// it will only ask for credentials if the URL is ADMIN
@GetMapping("/admin")
public String login() {
	return "Welcome Admin";
}

@GetMapping("/user")
public String user_login() {
	return "Welcome User";
}
@GetMapping("/getMsg")
public String greeting() {
	return "spring-security-example";
}
}
