package com.cice.ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.cice.ejercicio1")
public class Spring1Application {
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring1Application.class, args);
		EjemploI ejemploI = new Ejemplo();
		Acciones accion = (Acciones) ctx.getBean("acciones");
		accion.saludar();
		ejemploI.saludar();
	
	}
}
