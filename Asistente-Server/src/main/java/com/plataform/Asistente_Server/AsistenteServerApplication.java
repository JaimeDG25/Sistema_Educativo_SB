package com.plataform.Asistente_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AsistenteServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsistenteServerApplication.class, args);
	}

}
