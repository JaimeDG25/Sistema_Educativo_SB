package com.plataform.Material_Curso_Server.Controller;


import com.plataform.Material_Curso_Server.DTO.MaterialRequestDTO;
import com.plataform.Material_Curso_Server.Model.MaterialModel;
import com.plataform.Material_Curso_Server.Service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/material")
public class MaterialController {
    @Autowired
    private MaterialService service;

    @GetMapping("/listMaterial")
    public List<MaterialModel> listar(){
        return service.listarMateriales();
    }
    @PostMapping("/addMaterial")
    public ResponseEntity<?> registrar(@RequestBody MaterialRequestDTO request){
        return ResponseEntity.ok(service.registrarMaterial(request));
    }
}
