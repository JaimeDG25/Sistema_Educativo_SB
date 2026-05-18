package com.plataform.Seguridad_Server.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientAuthAsistenteDTO {
    @JsonProperty("nombreUsuario")
    private String nombre;
    @JsonProperty("apellidoUsuario")
    private String apellido;
    @JsonProperty("dniUsuario")
    private String dni;
    @JsonProperty("correoUsuario")
    private String correo;
    @JsonProperty("habilitadoUsuario")
    private Boolean habilitado;
    @JsonProperty("rolesUsuario")
    private String rol;

    public ClientAuthAsistenteDTO() {
    }

    public ClientAuthAsistenteDTO(String nombre, String apellido, String dni, String correo, Boolean habilitado, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.habilitado = habilitado;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
