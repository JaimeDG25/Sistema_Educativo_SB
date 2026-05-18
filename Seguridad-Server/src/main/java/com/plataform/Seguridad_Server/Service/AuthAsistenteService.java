package com.plataform.Seguridad_Server.Service;

import com.plataform.Seguridad_Server.Client.AsistenteClient;
import com.plataform.Seguridad_Server.DTOs.AsistenteRegisterRequestDTO;
import com.plataform.Seguridad_Server.DTOs.AsistenteRegisterResponseDTO;
import com.plataform.Seguridad_Server.DTOs.ClientAuthAsistenteDTO;
import com.plataform.Seguridad_Server.Model.AuthAsistenteModel;
import com.plataform.Seguridad_Server.Repository.AuthAsistenteRepository;
import com.plataform.Seguridad_Server.Security.JwtToken;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthAsistenteService {
    @Autowired
    private AsistenteClient clientEmpleado;
    @Autowired
    private AuthAsistenteRepository repositoryAuthentication;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtToken jwtUtil;

    public AsistenteRegisterResponseDTO registrarAsistente(AsistenteRegisterRequestDTO request) {
        ClientAuthAsistenteDTO empleado;
        try {
            empleado = clientEmpleado.buscarEmpleadoDni(request.getDni());
        } catch (FeignException.NotFound e) {
            throw new RuntimeException("El DNI no existe en Empleado");
        }
        if (!empleado.getHabilitado()) {
            throw new RuntimeException("Empleado deshabilitado");
        }
        if (repositoryAuthentication.findByDniAuth(request.getDni()).isPresent()) {
            throw new RuntimeException("El usuario ya está registrado");
        }
        AuthAsistenteModel usuario = new AuthAsistenteModel();
        usuario.setDniAuth(request.getDni());
        usuario.setCorreoAuth(empleado.getCorreo());
        usuario.setContraseñaAuth(passwordEncoder.encode(request.getContraseña()));
        usuario.setRolAuth(empleado.getRol());
        usuario.setHabilitadoAuth(true);
        repositoryAuthentication.save(usuario);
        return new AsistenteRegisterResponseDTO(
                usuario.getDniAuth(),
                usuario.getCorreoAuth(),
                usuario.getContraseñaAuth(),
                usuario.getRolAuth(),
                usuario.getHabilitadoAuth()
        );
    }

    public String loginAsistente(String dni, String password) {
        AuthAsistenteModel emp = repositoryAuthentication.findByDniAuth(dni)
                .orElseThrow(() -> new RuntimeException("No existe"));
        if (!emp.getHabilitadoAuth()) {
            throw new RuntimeException("Usuario deshabilitado");
        }
        if (!passwordEncoder.matches(password, emp.getContraseñaAuth())) {
            throw new RuntimeException("Contraseña incorrecta");
        }
        return jwtUtil.generateTokenByEmail(
                emp.getDniAuth(),
                emp.getRolAuth()
        );
    }
}
