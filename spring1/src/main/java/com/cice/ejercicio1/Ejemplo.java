package com.cice.ejercicio1;

import org.springframework.stereotype.Component;

@Component
public class Ejemplo implements EjemploI {

	@Override
	public void saludar() {
		System.out.println("Hola  Pepe");
		
	}

	@Override
	public void despedir() {
		System.out.println("Adios");
		
	}
	
	

}
