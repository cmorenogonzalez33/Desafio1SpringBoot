package com.example.desafio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.desafio1.services.ServicioEdificioI;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner{

	@Autowired
	private ServicioEdificioI servicioEdificio;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	public void run(String... args) throws Exception{
		servicioEdificio.crearEdificio();
		
		servicioEdificio.añadirPersona("Jose Joaquin", 1, 1);
		servicioEdificio.añadirPersona("Raul Prieto", 1, 2);
		servicioEdificio.añadirPersona("Ana Isabel Perez", 2, 1);
		servicioEdificio.añadirPersona("Antonio Hidalgo", 2, 2);
		servicioEdificio.añadirPersona("Persona 1", 2, 2);
		
		servicioEdificio.mostrarPersonasEdificio();
		
		servicioEdificio.buscarPropietario("Jose Joaquin");
		
	}
}
