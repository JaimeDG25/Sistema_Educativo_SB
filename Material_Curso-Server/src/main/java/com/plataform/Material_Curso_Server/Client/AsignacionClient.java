package com.plataform.Material_Curso_Server.Client;


import com.plataform.Material_Curso_Server.DTO.AsignacionClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Asignacion-Curso-Asistente-Server")
public interface AsignacionClient {
    @GetMapping("/asignacion/findById/{id}")
    AsignacionClientDTO buscarAsistentePorId(@PathVariable Long id);
}
