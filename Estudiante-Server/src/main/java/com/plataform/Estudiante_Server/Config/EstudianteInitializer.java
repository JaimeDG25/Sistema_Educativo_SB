package com.plataform.Estudiante_Server.Config;
import com.plataform.Estudiante_Server.Models.EstudianteModel;
import com.plataform.Estudiante_Server.Repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EstudianteInitializer implements CommandLineRunner {
    @Autowired
    private EstudianteRepository repository_estudiante;
    @Override
    public void run(String... args) {
        EstudianteModel estudiante = new EstudianteModel();
        estudiante.setNombreEstudiante("EstudianteN1");
        estudiante.setApellidoEstudiante("EstudianteA1");
        estudiante.setHabilitadoEstudiante(true);
        estudiante.setDniEstudiante("87654321");
        estudiante.setCorreoEstudiante("estudiante@gmail.com");
        estudiante.setRolEstudiante("Estudiante");
        repository_estudiante.save(estudiante);
        System.out.println("✅ estudiante creado correctamente");
    }
}
