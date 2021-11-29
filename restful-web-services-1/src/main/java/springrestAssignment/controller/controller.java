package springrestAssignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/log")
public class controller {

	@GetMapping("/abc")
	public String helloWorld() 
{
	return "Hello World!!!!";
}
}
