package com.cice.microserviciofeign.gestionproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaServer
@EnableFeignClients
@SpringBootApplication
public class GestionproductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionproductosApplication.class, args);
	}
}
