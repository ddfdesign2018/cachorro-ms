package com.cice.ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Acciones {
		
	@Autowired
	@Qualifier("ejemplo")
	private EjemploI ejemploI;

	public void saludar() {
		ejemploI.saludar();
	}
	
}
