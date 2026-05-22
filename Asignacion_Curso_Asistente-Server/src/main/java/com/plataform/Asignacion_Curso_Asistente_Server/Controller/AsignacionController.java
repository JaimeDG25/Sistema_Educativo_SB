package com.plataform.Asignacion_Curso_Asistente_Server.Controller;


import com.plataform.Asignacion_Curso_Asistente_Server.DTO.AsignacionRequestDTO;
import com.plataform.Asignacion_Curso_Asistente_Server.DTO.AsignacionResponseDTO;
import com.plataform.Asignacion_Curso_Asistente_Server.Model.AsignacionModel;
import com.plataform.Asignacion_Curso_Asistente_Server.Service.AsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/asignacion")
public class AsignacionController {
    @Autowired
    private AsignacionService service;

    @GetMapping("/listAsignacion")
    public List<AsignacionModel> listUsers(){
        return service.listarAsignacion();
    }

    @GetMapping("/findById/{id}")
    public AsignacionResponseDTO findById(@PathVariable Long id){
        return service.buscarAsignacionId(id);
    }
    @PostMapping("/addAsignacion")
    public ResponseEntity<?> registrar(@RequestBody AsignacionRequestDTO request){
        return ResponseEntity.ok(service.registrar(request));
    }
}
