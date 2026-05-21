package com.plataform.Asignacion_Curso_Asistente_Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class AsignacionCursoAsistenteServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(AsignacionCursoAsistenteServerApplication.class, args);
	}
}
