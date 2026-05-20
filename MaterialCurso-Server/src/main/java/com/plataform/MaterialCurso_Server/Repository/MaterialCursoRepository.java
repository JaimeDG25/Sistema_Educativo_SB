package com.plataform.MaterialCurso_Server.Repository;

import com.plataform.MaterialCurso_Server.Models.MaterialCursoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialCursoRepository extends JpaRepository<MaterialCursoModel, Long> {
}
