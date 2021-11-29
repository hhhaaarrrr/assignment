package com.delearserviceapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dealer")
public class DelearController {
	
	@GetMapping("/")
	public String greet() {
		return "hello welcome to dealer service ";
	}
	

}
