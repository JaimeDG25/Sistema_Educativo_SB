package com.plataform.Cursos_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CursosServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursosServerApplication.class, args);
	}

}
