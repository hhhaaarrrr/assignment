package springsecurityAssignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
	
	@GetMapping("/login1")
	public String user () {
		return ("welcome home page");
	}

}
