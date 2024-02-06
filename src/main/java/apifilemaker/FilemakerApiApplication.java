package apifilemaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import service.PruebaImplemet;


@SpringBootApplication(scanBasePackages={
		"service","apifilemaker","controler","repository"})
public class FilemakerApiApplication {
	
	public static void main(String[] args) throws IllegalAccessException {
	
		SpringApplication.run(FilemakerApiApplication.class, args);
		
	
	}

}
