package com.plataform.MaterialCurso_Server.Services;

import com.plataform.MaterialCurso_Server.DTOs.MaterialCursoRequest;
import com.plataform.MaterialCurso_Server.Models.MaterialCursoModel;
import com.plataform.MaterialCurso_Server.Repository.MaterialCursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialCursoService {

    private final MaterialCursoRepository repository;

    public MaterialCursoService(MaterialCursoRepository repository) {
        this.repository = repository;
    }

    public MaterialCursoModel crearMaterialDesdeRequest(MaterialCursoRequest request) {
        MaterialCursoModel material = new MaterialCursoModel();
        material.setAsignacionCuAsId(request.getAsignacionCuAsId());
        material.setTituloMaterial(request.getTituloMaterial());
        material.setDescripcionMaterial(request.getDescripcionMaterial());
        material.setTipoMaterial(request.getTipoMaterial());
        material.setEstadoMaterial(request.getEstadoMaterial());
        material.setUrlMaterial(request.getUrlMaterial());
        material.setFechaSubida(request.getFechaSubida());
        return repository.save(material);
    }

    public List<MaterialCursoModel> listarMateriales() {
        return repository.findAll();
    }

    public Optional<MaterialCursoModel> obtenerMaterialPorId(Long id) {
        return repository.findById(id);
    }

    public Optional<MaterialCursoModel> actualizarMaterial(Long id, MaterialCursoRequest request) {
        return repository.findById(id).map(existente -> {
            existente.setAsignacionCuAsId(request.getAsignacionCuAsId());
            existente.setTituloMaterial(request.getTituloMaterial());
            existente.setDescripcionMaterial(request.getDescripcionMaterial());
            existente.setTipoMaterial(request.getTipoMaterial());
            existente.setEstadoMaterial(request.getEstadoMaterial());
            existente.setUrlMaterial(request.getUrlMaterial());
            existente.setFechaSubida(request.getFechaSubida());
            return repository.save(existente);
        });
    }

    public void eliminarMaterial(Long id) {
        repository.deleteById(id);
    }
}
