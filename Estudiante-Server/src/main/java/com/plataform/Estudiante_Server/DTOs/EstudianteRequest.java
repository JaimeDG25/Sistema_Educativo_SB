package com.plataform.Estudiante_Server.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EstudianteRequest {

    @NotBlank(message = "El nombre es obligatorio")
    private String nombreEstudiante;

    @NotBlank(message = "El apellido es obligatorio")
    private String apellidoEstudiante;

    @NotBlank(message = "El DNI es obligatorio")
    @Size(min = 8, max = 8, message = "El DNI debe tener 8 caracteres")
    private String dniEstudiante;

    @NotBlank(message = "El correo es obligatorio")
    private String correoEstudiante;

    public EstudianteRequest() {}

    public EstudianteRequest(String nombreEstudiante, String apellidoEstudiante, String dniEstudiante, String correoEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.dniEstudiante = dniEstudiante;
        this.correoEstudiante = correoEstudiante;
    }

    public String getNombreEstudiante() { return nombreEstudiante; }
    public String getApellidoEstudiante() { return apellidoEstudiante; }
    public String getDniEstudiante() { return dniEstudiante; }
    public String getCorreoEstudiante() { return correoEstudiante; }

    public void setNombreEstudiante(String nombreEstudiante) { this.nombreEstudiante = nombreEstudiante; }
    public void setApellidoEstudiante(String apellidoEstudiante) { this.apellidoEstudiante = apellidoEstudiante; }
    public void setDniEstudiante(String dniEstudiante) { this.dniEstudiante = dniEstudiante; }
    public void setCorreoEstudiante(String correoEstudiante) { this.correoEstudiante = correoEstudiante; }
}
