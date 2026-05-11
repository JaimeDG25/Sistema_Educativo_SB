package com.plataform.Asistente_Server.Repository;

import com.plataform.Asistente_Server.Models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository <UsuarioModel,Long> {
    Optional<UsuarioModel> findByDniUsuario(String dniUsuario);
}
