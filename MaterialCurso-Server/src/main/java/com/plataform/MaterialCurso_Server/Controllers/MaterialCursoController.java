package com.plataform.MaterialCurso_Server.Controllers;

import com.plataform.MaterialCurso_Server.DTOs.MaterialCursoRequest;
import com.plataform.MaterialCurso_Server.DTOs.MaterialCursoResponse;
import com.plataform.MaterialCurso_Server.Models.MaterialCursoModel;
import com.plataform.MaterialCurso_Server.Services.MaterialCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/materialcurso")
public class MaterialCursoController {

    @Autowired
    private MaterialCursoService materialCursoService;

    @PostMapping
    public ResponseEntity<MaterialCursoResponse> crearMaterial(@Valid @RequestBody MaterialCursoRequest request) {
        MaterialCursoModel nuevo = materialCursoService.crearMaterialDesdeRequest(request);
        return ResponseEntity.ok(new MaterialCursoResponse(nuevo));
    }

    @GetMapping
    public ResponseEntity<List<MaterialCursoResponse>> listarMateriales() {
        List<MaterialCursoResponse> materiales = materialCursoService.listarMateriales()
                .stream()
                .map(MaterialCursoResponse::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok(materiales);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MaterialCursoResponse> obtenerMaterial(@PathVariable Long id) {
        return materialCursoService.obtenerMaterialPorId(id)
                .map(material -> ResponseEntity.ok(new MaterialCursoResponse(material)))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<MaterialCursoResponse> actualizarMaterial(@PathVariable Long id,
                                                                    @Valid @RequestBody MaterialCursoRequest request) {
        return materialCursoService.actualizarMaterial(id, request)
                .map(actualizado -> ResponseEntity.ok(new MaterialCursoResponse(actualizado)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarMaterial(@PathVariable Long id) {
        if (materialCursoService.obtenerMaterialPorId(id).isPresent()) {
            materialCursoService.eliminarMaterial(id);
            return ResponseEntity.ok("Material eliminado correctamente");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
