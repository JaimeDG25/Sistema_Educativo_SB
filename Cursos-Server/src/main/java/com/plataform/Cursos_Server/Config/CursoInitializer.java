package com.plataform.Cursos_Server.Config;
import com.plataform.Cursos_Server.Models.CursoModel;
import com.plataform.Cursos_Server.Repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class CursoInitializer implements CommandLineRunner {
    @Autowired
    private CursoRepository repositoryCurso;
    @Override
    public void run(String... args) {
        CursoModel inci = new CursoModel();
        inci.setNombreCurso("Impresora");
        inci.setDescripcionCurso("La impresora no imprime bien");
        inci.setCreditosCurso(12);
        repositoryCurso.save(inci);
        System.out.println("✅ Curso creado correctamente");

    }
}
