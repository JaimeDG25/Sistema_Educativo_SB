package com.plataform.Cursos_Server.Client;

import com.plataform.Cursos_Server.DTOs.ClientAsistenteRequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(name = "Asistente-server")
public interface ClientAsistente {
    @GetMapping("/employees/listEmployees")
    List<ClientAsistenteRequestDTO> listarEmpleados();
    @GetMapping("/employees/findByDni/{dni}")
    ClientAsistenteRequestDTO buscarEmpleadoDni(@PathVariable String dni);
}
