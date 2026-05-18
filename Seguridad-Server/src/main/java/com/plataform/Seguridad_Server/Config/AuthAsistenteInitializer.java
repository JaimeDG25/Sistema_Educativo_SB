package com.plataform.Seguridad_Server.Config;

import com.plataform.Seguridad_Server.Model.AuthAsistenteModel;
import com.plataform.Seguridad_Server.Repository.AuthAsistenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class AuthAsistenteInitializer implements CommandLineRunner {
    @Autowired
    private AuthAsistenteRepository asistenteRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public void run(String... args) {
        Optional<?> existeAdmin = asistenteRepository.findByDniAuth("12345678");
        if (existeAdmin.isEmpty()) {
            AuthAsistenteModel admin = new AuthAsistenteModel();
            admin.setDniAuth("12345678");
            admin.setRolAuth("ADMIN");
            admin.setCorreoAuth("administrador@gmail.com");
            admin.setHabilitadoAuth(true);
            admin.setContraseñaAuth(passwordEncoder.encode("admin123"));
            asistenteRepository.save(admin);
            System.out.println("✅ ADMIN logeado automáticamente oño");
        }
    }
}
