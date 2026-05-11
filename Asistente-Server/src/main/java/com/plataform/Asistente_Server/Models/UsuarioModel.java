package com.plataform.Asistente_Server.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "table_user")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    @Column(nullable = false)
    private String nombreUsuario;
    @Column(nullable = false)
    private String apellidoUsuario;
    @Column(nullable = false, unique = true)
    private String dniUsuario;
    @Column(nullable = false)
    private String correoUsuario;
    @Column(nullable = false)
    private Boolean habilitadoUsuario;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RolesModel rolesUsuario;

    public UsuarioModel() {}

    public UsuarioModel(Long idUsuario, String nombreUsuario, String apellidoUsuario, String dniUsuario, String correoUsuario, Boolean habilitadoUsuario, RolesModel rolesUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.dniUsuario = dniUsuario;
        this.correoUsuario = correoUsuario;
        this.habilitadoUsuario = habilitadoUsuario;
        this.rolesUsuario = rolesUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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

    public RolesModel getRolesUsuario() {
        return rolesUsuario;
    }

    public void setRolesUsuario(RolesModel rolesUsuario) {
        this.rolesUsuario = rolesUsuario;
    }
}
