package com.plataform.Asistente_Server.Config;
import com.plataform.Asistente_Server.Models.RolesModel;
import com.plataform.Asistente_Server.Models.UsuarioModel;
import com.plataform.Asistente_Server.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AsistenteInitializer implements CommandLineRunner {
    @Autowired
    private UsuarioRepository repository_asistente;
    @Override
    public void run(String... args) {
        UsuarioModel asistente = new UsuarioModel();
        asistente.setNombreUsuario("Zaiko");
        asistente.setApellidoUsuario("Tsakio");
        asistente.setHabilitadoUsuario(true);
        asistente.setDniUsuario("87654321");
        asistente.setCorreoUsuario("asistente@gmail.com");
        asistente.setRolesUsuario(RolesModel.ADMIN);
        repository_asistente.save(asistente);
        System.out.println("✅ asistente creado correctamente");
    }
}
