package com.plataform.Asignacion_Curso_Asistente_Server.Model;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="asignacion_cu_as")
public class AsignacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsignacion;
    @Column(nullable = false)
    private Long asistenteId;
    @Column(nullable = false)
    private Long cursoId;
    @Column(nullable = false)
    private LocalDate fechaAsignacion;

    public AsignacionModel() {}
    public AsignacionModel(Long idAsignacion, Long asistenteId, Long cursoId, LocalDate fechaAsignacion) {
        this.idAsignacion = idAsignacion;
        this.asistenteId = asistenteId;
        this.cursoId = cursoId;
        this.fechaAsignacion = fechaAsignacion;
    }

    public Long getIdAsignacion() {return idAsignacion;}
    public void setIdAsignacion(Long idAsignacion) {this.idAsignacion = idAsignacion;}

    public Long getAsistenteId() {return asistenteId;}
    public void setAsistenteId(Long asistenteId) {this.asistenteId = asistenteId;}

    public Long getCursoId() {return cursoId;}
    public void setCursoId(Long cursoId) {this.cursoId = cursoId;}

    public LocalDate getFechaAsignacion() {return fechaAsignacion;}
    public void setFechaAsignacion(LocalDate fechaAsignacion) {this.fechaAsignacion = fechaAsignacion;}
}
