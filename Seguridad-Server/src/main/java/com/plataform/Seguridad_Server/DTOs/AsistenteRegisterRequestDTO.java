package com.plataform.Seguridad_Server.DTOs;

public class AsistenteRegisterRequestDTO {
    private String dni;
    private String contraseña;

    public AsistenteRegisterRequestDTO(String dni, String contraseña) {
        this.dni = dni;
        this.contraseña = contraseña;
    }

    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}

    public String getContraseña() {return contraseña;}
    public void setContraseña(String contraseña) {this.contraseña = contraseña;}
}
