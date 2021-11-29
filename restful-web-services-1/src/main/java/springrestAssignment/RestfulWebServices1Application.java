package springrestAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class RestfulWebServices1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServices1Application.class, args);
	}

}
