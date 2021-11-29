package springrestAssignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class controller 
{
@GetMapping("/login1")
	public String greeting()
	{
		return "you are in welcome page";
	}
}
