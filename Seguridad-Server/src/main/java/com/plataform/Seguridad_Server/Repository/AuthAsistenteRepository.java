package com.plataform.Seguridad_Server.Repository;

import com.plataform.Seguridad_Server.Model.AuthAsistenteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuthAsistenteRepository extends JpaRepository<AuthAsistenteModel, Long> {
    Optional<AuthAsistenteModel> findByDniAuth(String dniAuth);
    List<AuthAsistenteModel> findByRolAuth(String rolAuth);
}
