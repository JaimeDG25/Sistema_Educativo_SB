package com.plataform.Asignacion_Curso_Asistente_Server.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CursoClientDTO {
    @JsonProperty("nombre")
    private String nombreCurso;
    @JsonProperty("descripcion")
    private String descripcionCurso;
    @JsonProperty("creditos")
    private Integer creditosCurso;

    public CursoClientDTO() {}
    public CursoClientDTO(String nombreCurso, String descripcionCurso, Integer creditosCurso) {
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcionCurso;
        this.creditosCurso = creditosCurso;
    }

    public String getNombreCurso() {return nombreCurso;}
    public void setNombreCurso(String nombreCurso) {this.nombreCurso = nombreCurso;}

    public String getDescripcionCurso() {return descripcionCurso;}
    public void setDescripcionCurso(String descripcionCurso) {this.descripcionCurso = descripcionCurso;}

    public Integer getCreditosCurso() {return creditosCurso;}
    public void setCreditosCurso(Integer creditosCurso) {this.creditosCurso = creditosCurso;}
}
