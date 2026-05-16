package com.plataform.Estudiante_Server.Repository;

import com.plataform.Estudiante_Server.Models.EstudianteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteModel, Long> {
    Optional<EstudianteModel> findByDniEstudiante(String dniEstudiante);
}
