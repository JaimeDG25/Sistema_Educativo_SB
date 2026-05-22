package com.plataform.Material_Curso_Server.DTO;

public class UsuarioClientDTO {
    private String nombreUsuario;
    private String apellidoUsuario;
    private String dniUsuario;
    private String correoUsuario;
    private Boolean habilitadoUsuario;
    private String rolUsuario;

    public UsuarioClientDTO() {}
    public UsuarioClientDTO(String nombreUsuario, String apellidoUsuario, String dniUsuario, String correoUsuario, Boolean habilitadoUsuario, String rolUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.dniUsuario = dniUsuario;
        this.correoUsuario = correoUsuario;
        this.habilitadoUsuario = habilitadoUsuario;
        this.rolUsuario = rolUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public Boolean getHabilitadoUsuario() {
        return habilitadoUsuario;
    }

    public void setHabilitadoUsuario(Boolean habilitadoUsuario) {
        this.habilitadoUsuario = habilitadoUsuario;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
}
