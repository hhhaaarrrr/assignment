package springrestAssignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/harshuu")
	public String  getHello() {
		return "Hello Harshuuu";
	}
}
