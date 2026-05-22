package com.plataform.Material_Curso_Server.Service;
import com.plataform.Material_Curso_Server.Client.AsignacionClient;
import com.plataform.Material_Curso_Server.DTO.AsignacionClientDTO;
import com.plataform.Material_Curso_Server.DTO.MaterialRequestDTO;
import com.plataform.Material_Curso_Server.DTO.MaterialResponseDTO;
import com.plataform.Material_Curso_Server.Model.MaterialModel;
import com.plataform.Material_Curso_Server.Repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Service
public class MaterialService {

    @Autowired
    private MaterialRepository repository;
    @Autowired
    private AsignacionClient asignacionClient;

    public List<MaterialModel> listarMateriales() {
        return repository.findAll();
    }
    public Optional<MaterialModel> obtenerMaterialPorId(Long id) {
        return repository.findById(id);
    }

    public MaterialResponseDTO registrarMaterial(MaterialRequestDTO request) {
        AsignacionClientDTO asignacion = asignacionClient.buscarAsistentePorId(request.getIdAsignacion());
        if(asignacion == null){throw new RuntimeException("Asignacion no encontrado");}
        MaterialModel material = new MaterialModel();
        material.setAsignacionCuAsId(request.getIdAsignacion());
        material.setTituloMaterial(request.getTitulo());
        material.setDescripcionMaterial(request.getDescripcion());
        material.setTipoMaterial(request.getTipo());
        material.setEstadoMaterial(request.getEstado());
        material.setUrlMaterial(request.getUrl());
        material.setFechaSubida(LocalDate.now());
        repository.save(material);
        return new MaterialResponseDTO(
                material.getIdMaterial(),
                asignacion,
                material.getTituloMaterial(),
                material.getDescripcionMaterial(),
                material.getTipoMaterial(),
                material.getEstadoMaterial(),
                material.getUrlMaterial(),
                material.getFechaSubida()
        );
    }

    /*public Optional<MaterialCursoModel> actualizarMaterial(Long id, MaterialCursoRequest request) {
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
    }*/

    public void eliminarMaterial(Long id) {
        repository.deleteById(id);
    }
}
