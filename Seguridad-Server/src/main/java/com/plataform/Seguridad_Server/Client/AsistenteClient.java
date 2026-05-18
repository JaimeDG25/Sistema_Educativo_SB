package com.plataform.Seguridad_Server.Client;

import com.plataform.Seguridad_Server.DTOs.ClientAuthAsistenteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Asistente-Server")
public interface AsistenteClient {
    @GetMapping("/employees/listEmployees")
    List<ClientAuthAsistenteDTO> listarEmpleados();
    @GetMapping("/employees/findByDni/{dni}")
    ClientAuthAsistenteDTO buscarEmpleadoDni(@PathVariable String dni);
}
