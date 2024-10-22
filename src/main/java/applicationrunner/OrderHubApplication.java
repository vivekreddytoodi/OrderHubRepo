package applicationrunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"applicationrunner", "applicationrunner.service", "applicationrunner.security"})
public class OrderHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderHubApplication.class, args);
	}

}

