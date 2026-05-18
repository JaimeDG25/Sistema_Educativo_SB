package com.plataform.Seguridad_Server.Controller;


import com.plataform.Seguridad_Server.DTOs.AsistenteRegisterRequestDTO;
import com.plataform.Seguridad_Server.Service.AuthAsistenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController()
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthAsistenteService serviceAuthentication;

    @GetMapping("/libre")
    public String repuestaSinLogin(){
        return "Haz logrado ingresar a la session libre correactamente";
    }
    @GetMapping("/seguro")
    public String repuestaCoonLogin(){
        return "Haz logrado ingresar a la session segura correactamente";
    }
    @PostMapping("/registerAsistente")
    public ResponseEntity<Map<String, Object>> register(@RequestBody AsistenteRegisterRequestDTO request) {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("mensaje", "Asistente registrado correctamente");
            response.put("data", serviceAuthentication.registrarAsistente(request));
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            response.put("mensaje", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }
    @PostMapping("/loginAsistente")
    public ResponseEntity<Map<String, Object>> loginEmpleado(@RequestBody AsistenteRegisterRequestDTO request) {
        Map<String, Object> response = new HashMap<>();
        try {
            String token = serviceAuthentication.loginAsistente(
                    request.getDni(),
                    request.getContraseña()
            );
            response.put("mensaje", "Login correcto");
            response.put("token", token);
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            response.put("mensaje", e.getMessage());
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }
}
