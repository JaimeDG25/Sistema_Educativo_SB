package com.plataform.Asignacion_Curso_Asistente_Server.Client;
import com.plataform.Asignacion_Curso_Asistente_Server.DTO.CursoClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Cursos-Server")
public interface CursoClient {
    @GetMapping("/curso/findCursoById/{id}")
    CursoClientDTO buscarCursoPorId(@PathVariable Long id);
}
