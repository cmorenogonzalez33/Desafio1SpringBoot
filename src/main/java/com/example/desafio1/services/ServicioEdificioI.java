package com.example.desafio1.services;

public interface ServicioEdificioI {
	public void crearEdificio();
	
	public void añadirPersona(String propietario, int planta, int puerta);
	
	public void mostrarPersonasEdificio();
	
	public void buscarPropietario(String propietario);
	
}
