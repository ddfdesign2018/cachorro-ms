package com.cice.ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Acciones {
		
	@Autowired
	private EjemploI ejemploI;

	public void saludar() {
		ejemploI.saludar();
	}
	
}
