package com.plataform.Material_Curso_Server.DTO;

import java.time.LocalDate;

public class MaterialResponseDTO {
    private Long materialId;
    private AsignacionClientDTO idAsignacion;
    private String titulo;
    private String descripcion;
    private String tipo;
    private Boolean estado;
    private String url;
    private LocalDate fecha;

    public MaterialResponseDTO() {}
    public MaterialResponseDTO(Long materialId, AsignacionClientDTO idAsignacion, String titulo, String descripcion, String tipo, Boolean estado, String url, LocalDate fecha) {
        this.materialId = materialId;
        this.idAsignacion = idAsignacion;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.estado = estado;
        this.url = url;
        this.fecha = fecha;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public AsignacionClientDTO getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(AsignacionClientDTO idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
