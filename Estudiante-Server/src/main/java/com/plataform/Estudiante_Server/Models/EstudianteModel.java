package com.plataform.Estudiante_Server.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "table_estudiante")
public class EstudianteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstudiante;

    @Column(nullable = false)
    private String nombreEstudiante;

    @Column(nullable = false)
    private String apellidoEstudiante;

    @Column(nullable = false, unique = true)
    private String dniEstudiante;

    @Column(nullable = false)
    private String correoEstudiante;

    public EstudianteModel() {}

    public EstudianteModel(Long idEstudiante, String nombreEstudiante, String apellidoEstudiante, String dniEstudiante, String correoEstudiante) {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.dniEstudiante = dniEstudiante;
        this.correoEstudiante = correoEstudiante;
    }

    public Long getIdEstudiante() { return idEstudiante; }
    public void setIdEstudiante(Long idEstudiante) { this.idEstudiante = idEstudiante; }

    public String getNombreEstudiante() { return nombreEstudiante; }
    public void setNombreEstudiante(String nombreEstudiante) { this.nombreEstudiante = nombreEstudiante; }

    public String getApellidoEstudiante() { return apellidoEstudiante; }
    public void setApellidoEstudiante(String apellidoEstudiante) { this.apellidoEstudiante = apellidoEstudiante; }

    public String getDniEstudiante() { return dniEstudiante; }
    public void setDniEstudiante(String dniEstudiante) { this.dniEstudiante = dniEstudiante; }

    public String getCorreoEstudiante() { return correoEstudiante; }
    public void setCorreoEstudiante(String correoEstudiante) { this.correoEstudiante = correoEstudiante; }
}
