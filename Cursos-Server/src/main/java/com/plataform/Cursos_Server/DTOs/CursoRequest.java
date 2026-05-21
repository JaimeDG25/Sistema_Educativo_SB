package com.plataform.Cursos_Server.DTOs;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CursoRequest {

    @NotBlank(message = "El nombre es obligatorio")
    private String nombreCurso;

    @NotBlank(message = "La descripción es obligatoria")
    private String descripcionCurso;

    @NotNull(message = "Los créditos son obligatorios")
    private Integer creditosCurso;

    public String getNombreCurso() { return nombreCurso; }
    public void setNombreCurso(String nombreCurso) { this.nombreCurso = nombreCurso; }

    public String getDescripcionCurso() { return descripcionCurso; }
    public void setDescripcionCurso(String descripcionCurso) { this.descripcionCurso = descripcionCurso; }

    public Integer getCreditosCurso() { return creditosCurso; }
    public void setCreditosCurso(Integer creditosCurso) { this.creditosCurso = creditosCurso; }
}