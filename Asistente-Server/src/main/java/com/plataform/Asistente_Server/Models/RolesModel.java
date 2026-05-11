package com.plataform.Asistente_Server.Models;

public enum RolesModel {
    ADMIN("Administrador"),
    ASISTENTE("Técnico");
    private final String descripcion;

    RolesModel(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
}
