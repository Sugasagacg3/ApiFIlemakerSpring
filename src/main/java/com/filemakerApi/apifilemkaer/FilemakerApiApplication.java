package com.filemakerApi.apifilemkaer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import conexion.Conexion;
import dominios.Prueba4;

@SpringBootApplication
public class FilemakerApiApplication {

	public static void main(String[] args) throws IllegalAccessException {
	
		SpringApplication.run(FilemakerApiApplication.class, args);
		
		Conexion.query( Prueba4.class, "Select CreadoPor from prueba4");
	}

}
