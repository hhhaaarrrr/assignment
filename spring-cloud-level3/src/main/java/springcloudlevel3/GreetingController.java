package springcloudlevel3;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	//1 //3
/*	@Value("${app.description: default value }")
	private String greetingMessage;
	//2
	@Value("some static message")
	private String staticMessage; 
	
	@Value("${my.list.values}")
	private List<String> listValues; 
	
	
	//# converts the data followed by it to string
	@Value("#{${dbValues}}")
	private Map<String,String> dbValues; */
	
	@Autowired
	private DbSettings dbSettings;
	
	@Autowired
	private Environment env; //environment exteds by default all things u cando
	
	public GreetingController() {
		
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		//return staticMessage;
		//return (greetingMessage+ staticMessage +listValues + dbValues); 
		return ( dbSettings.getConnection()+ dbSettings.getHost()+dbSettings.getPort());
	}
	
	
	@GetMapping("/envdetails")
	public String envDetails () {
		return env.toString();
	}
	
}
