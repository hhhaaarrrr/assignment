package com.example.delearAPIresource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/greeting")
public class DelearAPIResouce {
	
	
	@RequestMapping("/")
	public String greet() {
		return "Hello world....";
	}

}
