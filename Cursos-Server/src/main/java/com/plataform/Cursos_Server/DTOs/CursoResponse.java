package com.plataform.Cursos_Server.DTOs;

import com.plataform.Cursos_Server.Models.CursoModel;

public class CursoResponse {
    private String nombre;
    private String descripcion;
    private Integer creditos;

    public CursoResponse() {}

    public CursoResponse(String nombre, String descripcion, Integer creditos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
    }

    public CursoResponse(CursoModel model) {
        this.nombre = model.getNombreCurso();
        this.descripcion = model.getDescripcionCurso();
        this.creditos = model.getCreditosCurso();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Integer getCreditos() { return creditos; }
    public void setCreditos(Integer creditos) { this.creditos = creditos; }
}
