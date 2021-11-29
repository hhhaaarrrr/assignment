package com.farmerserviceapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/farmer")
public class FarmerServiceController {

	@GetMapping("/")
	public String greet() {
		return "hello welcome to farmers service ";
	}
}
