package com.plataform.Estudiante_Server.Controllers;
import com.plataform.Estudiante_Server.DTOs.EstudianteRequest;
import com.plataform.Estudiante_Server.Services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;
import com.plataform.Estudiante_Server.DTOs.EstudianteResponse;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @GetMapping("/listEstudiante")
    public List<EstudianteResponse> listEstudiante() {
        return service.listarEstudiantes();
    }
    @GetMapping("/findEstudianteById/{id}")
    public ResponseEntity<EstudianteResponse> findEstudianteById(@PathVariable Long id) {
        return service.buscarEstudiantePorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/addEstudiante")
    public ResponseEntity<Map<String, Object>> addEstudiante(@Valid @RequestBody EstudianteRequest request) {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("mensaje", "Estudiante creado correctamente");
            response.put("data", service.agregarEstudiante(request));
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            response.put("mensaje", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PutMapping("/updateEstudiante/{id}")
    public ResponseEntity<Map<String, Object>> updateEstudiante(@PathVariable Long id, @Valid @RequestBody EstudianteRequest request) {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("mensaje", "Estudiante actualizado correctamente");
            response.put("data", service.actualizarEstudiante(id, request));
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            response.put("mensaje", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }

    @DeleteMapping("/deleteEstudiante/{id}")
    public ResponseEntity<Map<String, Object>> deleteEstudiante(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        if (service.eliminarEstudiante(id)) {
            response.put("mensaje", "Estudiante eliminado correctamente");
            return ResponseEntity.ok(response);
        } else {
            response.put("mensaje", "Estudiante no encontrado");
            return ResponseEntity.badRequest().body(response);
        }
    }
}
