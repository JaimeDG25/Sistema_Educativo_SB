package com.plataform.Estudiante_Server.DTOs;

import com.plataform.Estudiante_Server.Models.EstudianteModel;

public class EstudianteResponse {
    private String nombre;
    private String apellido;
    private String dni;
    private String correo;

    public EstudianteResponse() {}

    public EstudianteResponse(String nombre, String apellido, String dni, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
    }

    public EstudianteResponse(EstudianteModel model) {
        this.nombre = model.getNombreEstudiante();
        this.apellido = model.getApellidoEstudiante();
        this.dni = model.getDniEstudiante();
        this.correo = model.getCorreoEstudiante();
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
}
