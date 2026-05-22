package com.plataform.Material_Curso_Server.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class AsignacionClientDTO {
    @JsonProperty("asistente")
    private UsuarioClientDTO  asistente;
    @JsonProperty("curso")
    private CursoClientDTO  curso;
    @JsonProperty("fechaAsignacion")
    private LocalDate fechaAsignacion;

    public AsignacionClientDTO() {
    }

    public AsignacionClientDTO(UsuarioClientDTO asistente, LocalDate fechaAsignacion, CursoClientDTO curso) {
        this.asistente = asistente;
        this.fechaAsignacion = fechaAsignacion;
        this.curso = curso;
    }

    public UsuarioClientDTO getAsistente() {return asistente;}
    public void setAsistente(UsuarioClientDTO asistente) {this.asistente = asistente;}

    public CursoClientDTO getCurso() {return curso;}
    public void setCurso(CursoClientDTO curso) {this.curso = curso;}

    public LocalDate getFechaAsignacion() {return fechaAsignacion;}
    public void setFechaAsignacion(LocalDate fechaAsignacion) {this.fechaAsignacion = fechaAsignacion;}
}
