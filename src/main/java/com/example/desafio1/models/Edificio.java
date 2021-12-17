package com.example.desafio1.models;

import java.util.HashMap;
import java.util.Map;

public class Edificio {
	private Map<Map<Integer, Integer>, String> edificioViviendas;
	
	public Edificio() {
		edificioViviendas = new HashMap<>();
	}

	public void setEdificioViviendas(String propietario, int planta, int puerta) {
		Map<Integer, Integer> vivienda = new HashMap<>();
		vivienda.put(planta, puerta);
		edificioViviendas.put(vivienda, propietario);
	}
	
	public Map<Map<Integer, Integer>, String> getPropietarios(){
		return edificioViviendas;
	}
}
