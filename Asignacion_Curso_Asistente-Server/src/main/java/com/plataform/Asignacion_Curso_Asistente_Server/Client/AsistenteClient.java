package com.plataform.Asignacion_Curso_Asistente_Server.Client;
import com.plataform.Asignacion_Curso_Asistente_Server.DTO.UsuarioClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Asistente-Server")
public interface AsistenteClient {
    @GetMapping("/asistente/findById/{id}")
    UsuarioClientDTO buscarAsistentePorId(@PathVariable Long id);
}
