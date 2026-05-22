package com.plataform.Material_Curso_Server.Repository;

import com.plataform.Material_Curso_Server.Model.MaterialModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<MaterialModel,Long> {
}
