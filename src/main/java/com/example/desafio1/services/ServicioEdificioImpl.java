package com.example.desafio1.services;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafio1.models.Edificio;

@Service
public class ServicioEdificioImpl implements ServicioEdificioI {

	@Autowired
	private Edificio edificio;
	
	@Override
	public void crearEdificio() {
		edificio = new Edificio();
	}
	
	@Override
	public void añadirPersona(String propietario, int planta, int puerta) {
		edificio.setEdificioViviendas(propietario, planta, puerta);
	}

	@Override
	public void mostrarPersonasEdificio() {
		final Map<Map<Integer, Integer>, String> edi = edificio.getPropietarios();
		
		System.out.println("Los propietarios del edificio son: ");
		edi.values().forEach(System.out::println);
	}

	@Override
	public void buscarPropietario(String propietario) {
		final Map<Map<Integer, Integer>, String> edi = edificio.getPropietarios();
		
		if (edi.containsValue(propietario)){
			System.out.println("El propietario " + propietario + " no vive en el edificio.");
		}	
		else{
			Map<Object, Object> map = 
				edi.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), propietario)).
				collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
			
			System.out.println("El propietario " + propietario + " vive en la vivienda (planta, puerta) " + map.toString());
		}         	
	            
		
	
	}
	
}
