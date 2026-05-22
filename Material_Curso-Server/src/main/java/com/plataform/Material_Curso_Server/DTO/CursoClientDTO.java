package com.plataform.Material_Curso_Server.DTO;

public class CursoClientDTO {
    private String nombre;
    private String descripcion;
    private Integer creditos;

    public CursoClientDTO() {}
    public CursoClientDTO(String nombre, String descripcion, Integer creditos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
}
