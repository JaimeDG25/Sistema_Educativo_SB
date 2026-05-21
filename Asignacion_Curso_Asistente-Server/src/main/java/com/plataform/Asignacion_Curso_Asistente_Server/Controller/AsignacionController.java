package com.plataform.Asignacion_Curso_Asistente_Server.Controller;


import com.plataform.Asignacion_Curso_Asistente_Server.DTO.AsignacionRequestDTO;
import com.plataform.Asignacion_Curso_Asistente_Server.Service.AsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asignacion")
public class AsignacionController {
    @Autowired
    private AsignacionService service;

    @PostMapping("/addAsignacion")
    public ResponseEntity<?> registrar(@RequestBody AsignacionRequestDTO request){
        return ResponseEntity.ok(service.registrar(request));
    }
}
