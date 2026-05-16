package com.plataform.Cursos_Server.Repository;

import com.plataform.Cursos_Server.Models.CursoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CursoRepository extends JpaRepository<CursoModel, Long> {
    Optional<CursoModel> findByNombreCurso(String nombreCurso);
}
