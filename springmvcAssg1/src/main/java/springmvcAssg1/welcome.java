
package springmvcAssg1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class welcome {
	@RequestMapping("/helloWorld")
		public String hello() {
			return "helloWorld";
		}
	
}