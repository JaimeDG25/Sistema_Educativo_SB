package com.plataform.Cursos_Server.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "table_curso")
public class CursoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;
    @Column(nullable = false)
    private String nombreCurso;
    @Column(nullable = false)
    private String descripcionCurso;
    @Column(nullable = false)
    private Integer creditosCurso;

    public CursoModel() {}

    public CursoModel(Long idCurso, String nombreCurso, String descripcionCurso, Integer creditosCurso) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcionCurso;
        this.creditosCurso = creditosCurso;
    }

    public Long getIdCurso() { return idCurso; }
    public void setIdCurso(Long idCurso) { this.idCurso = idCurso; }

    public String getNombreCurso() { return nombreCurso; }
    public void setNombreCurso(String nombreCurso) { this.nombreCurso = nombreCurso; }

    public String getDescripcionCurso() { return descripcionCurso; }
    public void setDescripcionCurso(String descripcionCurso) { this.descripcionCurso = descripcionCurso; }

    public Integer getCreditosCurso() { return creditosCurso; }
    public void setCreditosCurso(Integer creditosCurso) { this.creditosCurso = creditosCurso; }
}
