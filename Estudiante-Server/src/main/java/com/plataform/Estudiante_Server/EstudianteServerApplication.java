package com.plataform.Estudiante_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EstudianteServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudianteServerApplication.class, args);
	}

}
