package apifilemaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "service", "apifilemaker", "controler", "repository","apifilemaker.swager" })
public class FilemakerApiApplication {

	public static void main(String[] args) throws IllegalAccessException {

		SpringApplication.run(FilemakerApiApplication.class, args);

	}

}
