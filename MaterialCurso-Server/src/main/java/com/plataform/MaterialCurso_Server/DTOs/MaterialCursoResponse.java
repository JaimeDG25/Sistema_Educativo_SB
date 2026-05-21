package com.plataform.MaterialCurso_Server.DTOs;

import com.plataform.MaterialCurso_Server.Models.MaterialCursoModel;
import java.time.LocalDate;

public class MaterialCursoResponse {

    private Long idMaterial;
    private Long asignacionCuAsId;
    private String tituloMaterial;
    private String descripcionMaterial;
    private String tipoMaterial;
    private String estadoMaterial;
    private String urlMaterial;
    private LocalDate fechaSubida;

    public MaterialCursoResponse(MaterialCursoModel material) {
        this.idMaterial = material.getIdMaterial();
        this.asignacionCuAsId = material.getAsignacionCuAsId(); 
        this.tituloMaterial = material.getTituloMaterial();
        this.descripcionMaterial = material.getDescripcionMaterial();
        this.tipoMaterial = material.getTipoMaterial();
        this.estadoMaterial = material.getEstadoMaterial();
        this.urlMaterial = material.getUrlMaterial();
        this.fechaSubida = material.getFechaSubida();
    }

    public Long getIdMaterial() { return idMaterial; }
    public Long getAsignacionCuAsId() { return asignacionCuAsId; }
    public String getTituloMaterial() { return tituloMaterial; }
    public String getDescripcionMaterial() { return descripcionMaterial; }
    public String getTipoMaterial() { return tipoMaterial; }
    public String getEstadoMaterial() { return estadoMaterial; }
    public String getUrlMaterial() { return urlMaterial; }
    public LocalDate getFechaSubida() { return fechaSubida; }
}
