package com.cice.ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring1Application {

	
	
	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
		EjemploI ejemploI = new Ejemplo();
		Acciones accion = new Acciones();
		accion.saludar();
		ejemploI.saludar();
	
	}
}
