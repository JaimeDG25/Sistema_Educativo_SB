package com.plataform.Cursos_Server.Services;

import com.plataform.Cursos_Server.Models.CursoModel;
import com.plataform.Cursos_Server.Repository.CursoRepository;
import com.plataform.Cursos_Server.DTOs.CursoRequest;
import com.plataform.Cursos_Server.DTOs.CursoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repo;

    public List<CursoResponse> listarCursos() {
        return repo.findAll()
                   .stream()
                   .map(CursoResponse::new) // convierte Model → DTO
                   .toList();
    }
    public Optional<CursoResponse> buscarCursoPorId(Long id) {
        return repo.findById(id)
                   .map(CursoResponse::new);
    }

    public Optional<CursoResponse> buscarCursoPorNombre(String nombreCurso) {
        return repo.findByNombreCurso(nombreCurso)
                   .map(CursoResponse::new);
    }

    public CursoResponse agregarCurso(CursoRequest request) {
        CursoModel c = new CursoModel();
        c.setNombreCurso(request.getNombreCurso());
        c.setDescripcionCurso(request.getDescripcionCurso());
        c.setCreditosCurso(request.getCreditosCurso());
        CursoModel saved = repo.save(c);
        return new CursoResponse(saved);
    }

    public Optional<CursoResponse> actualizarCurso(Long id, CursoRequest request) {
        return repo.findById(id)
                   .map(c -> {
                       c.setNombreCurso(request.getNombreCurso());
                       c.setDescripcionCurso(request.getDescripcionCurso());
                       c.setCreditosCurso(request.getCreditosCurso());
                       CursoModel updated = repo.save(c);
                       return new CursoResponse(updated);
                   });
    }

    public boolean eliminarCurso(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}
