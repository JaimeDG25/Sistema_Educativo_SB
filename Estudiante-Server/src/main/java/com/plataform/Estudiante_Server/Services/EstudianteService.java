package com.plataform.Estudiante_Server.Services;

import com.plataform.Estudiante_Server.Models.EstudianteModel;
import com.plataform.Estudiante_Server.Repository.EstudianteRepository;
import com.plataform.Estudiante_Server.DTOs.EstudianteRequest;
import com.plataform.Estudiante_Server.DTOs.EstudianteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository repo;

    public List<EstudianteResponse> listarEstudiantes() {
        return repo.findAll()
                   .stream()
                   .map(EstudianteResponse::new)
                   .toList();
    }

    public Optional<EstudianteResponse> buscarEstudiantePorId(Long id) {
        return repo.findById(id)
                   .map(EstudianteResponse::new);
    }

    public Optional<EstudianteResponse> buscarEstudiantePorDni(String dni) {
        return repo.findByDniEstudiante(dni)
                   .map(EstudianteResponse::new);
    }

    public EstudianteResponse agregarEstudiante(EstudianteRequest request) {
        EstudianteModel e = new EstudianteModel();
        e.setNombreEstudiante(request.getNombreEstudiante());
        e.setApellidoEstudiante(request.getApellidoEstudiante());
        e.setDniEstudiante(request.getDniEstudiante());
        e.setCorreoEstudiante(request.getCorreoEstudiante());
        EstudianteModel saved = repo.save(e);
        return new EstudianteResponse(saved);
    }

    public Optional<EstudianteResponse> actualizarEstudiante(Long id, EstudianteRequest request) {
        return repo.findById(id)
                   .map(e -> {
                       e.setNombreEstudiante(request.getNombreEstudiante());
                       e.setApellidoEstudiante(request.getApellidoEstudiante());
                       e.setDniEstudiante(request.getDniEstudiante());
                       e.setCorreoEstudiante(request.getCorreoEstudiante());
                       EstudianteModel updated = repo.save(e);
                       return new EstudianteResponse(updated);
                   });
    }

    public boolean eliminarEstudiante(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}
