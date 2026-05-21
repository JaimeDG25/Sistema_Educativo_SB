package com.plataform.Cursos_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;

@EnableDiscoveryClient
@SpringBootApplication
@FeignClient
public class CursosServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursosServerApplication.class, args);
	}

}
