package com.plataform.Cursos_Server.Controllers;

import com.plataform.Cursos_Server.DTOs.CursoRequest;
import com.plataform.Cursos_Server.DTOs.CursoResponse;
import com.plataform.Cursos_Server.Services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private CursoService service;

    @GetMapping("/listCurso")
    public List<CursoResponse> listCurso() {
        return service.listarCursos();
    }

    @GetMapping("/findCursoById/{id}")
    public ResponseEntity<CursoResponse> findCursoById(@PathVariable Long id) {
        return service.buscarCursoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/addCurso")
    public ResponseEntity<Map<String,Object>> addCurso(@Valid @RequestBody CursoRequest request) {
        Map<String,Object> response = new HashMap<>();
        response.put("mensaje", "Curso creado correctamente");
        response.put("data", service.agregarCurso(request));
        return ResponseEntity.ok(response);
    }

    @PutMapping("/updateCurso/{id}")
    public ResponseEntity<Map<String,Object>> updateCurso(@PathVariable Long id, @Valid @RequestBody CursoRequest request) {
        Map<String,Object> response = new HashMap<>();
        response.put("mensaje", "Curso actualizado correctamente");
        response.put("data", service.actualizarCurso(id, request));
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/deleteCurso/{id}")
    public ResponseEntity<Map<String,Object>> deleteCurso(@PathVariable Long id) {
        Map<String,Object> response = new HashMap<>();
        if (service.eliminarCurso(id)) {
            response.put("mensaje", "Curso eliminado correctamente");
            return ResponseEntity.ok(response);
        } else {
            response.put("mensaje", "Curso no encontrado");
            return ResponseEntity.badRequest().body(response);
        }
    }
}
