package com.plataform.Asignacion_Curso_Asistente_Server.DTO;

import java.time.LocalDate;

public class AsignacionResponseDTO {
    private Long idAsignacion;
    private UsuarioClientDTO asistente;
    private CursoClientDTO curso;
    private LocalDate fechaAsignacion;

    public AsignacionResponseDTO() {}

    public AsignacionResponseDTO(Long idAsignacion, UsuarioClientDTO asistente, CursoClientDTO curso, LocalDate fechaAsignacion) {
        this.idAsignacion = idAsignacion;
        this.asistente = asistente;
        this.curso = curso;
        this.fechaAsignacion = fechaAsignacion;
    }

    public Long getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(Long idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public UsuarioClientDTO getAsistente() {
        return asistente;
    }

    public void setAsistente(UsuarioClientDTO asistente) {
        this.asistente = asistente;
    }

    public CursoClientDTO getCurso() {
        return curso;
    }

    public void setCurso(CursoClientDTO curso) {
        this.curso = curso;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }
}
