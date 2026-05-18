package com.plataform.Seguridad_Server.DTOs;

public class AsistenteRegisterResponseDTO {
    private String dni;
    private String correo;
    private String contraseña;
    private String rol;
    private Boolean habilitado;

    public AsistenteRegisterResponseDTO(String dni, String correo, String contraseña, String rol, Boolean habilitado) {
        this.dni = dni;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
        this.habilitado = habilitado;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }
}
