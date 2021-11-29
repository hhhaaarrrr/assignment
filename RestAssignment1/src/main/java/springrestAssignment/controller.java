package springrestAssignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

@GetMapping("/login")
 public String hello() 
{
	 return "hello world!!";
}
}
