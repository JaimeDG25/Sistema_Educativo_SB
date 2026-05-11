package com.plataform.Asistente_Server.Controllers;

import com.plataform.Asistente_Server.DTOs.UsuarioRequest;
import com.plataform.Asistente_Server.DTOs.UsuarioResponse;
import com.plataform.Asistente_Server.Models.UsuarioModel;
import com.plataform.Asistente_Server.Services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/asistente")
public class UsuarioController {
    @Autowired
    UsuarioService serviceUsuario;

    @GetMapping("/listUsers")
    public List<UsuarioModel> listUsers(){
        return serviceUsuario.listarUsuarios();
    }
    @GetMapping("/findById/{id}")
    public Optional<UsuarioModel> findById(@PathVariable Long id){
        return serviceUsuario.buscarUsuarioId(id);
    }
    @GetMapping("/findByDni/{dni}")
    public Optional<UsuarioModel> findByDni(@PathVariable String dni){
        return serviceUsuario.buscarUsuarioDni(dni);
    }

    @PostMapping("/addUser")
    public ResponseEntity<Map<String, Object>> addUser(@Valid @RequestBody UsuarioRequest usuario){
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("mensaje", "Empleado creado correctamente");
            response.put("data", serviceUsuario.agregarUsuario(usuario));
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            response.put("mensaje", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }

}
