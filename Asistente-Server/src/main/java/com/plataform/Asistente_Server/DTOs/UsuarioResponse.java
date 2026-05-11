package com.plataform.Asistente_Server.DTOs;

public class UsuarioResponse {
    private String nameUser;
    private String lastnameUser;
    private String dniUser;
    private String roleUser;
    private Boolean stateUser;

    public UsuarioResponse() {}
    public UsuarioResponse(String nameUser, String lastnameUser, String dniUser, String roleUser, Boolean stateUser) {
        this.nameUser = nameUser;
        this.lastnameUser = lastnameUser;
        this.dniUser = dniUser;
        this.roleUser = roleUser;
        this.stateUser = stateUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastnameUser() {
        return lastnameUser;
    }

    public void setLastnameUser(String lastnameUser) {
        this.lastnameUser = lastnameUser;
    }

    public String getDniUser() {
        return dniUser;
    }

    public void setDniUser(String dniUser) {
        this.dniUser = dniUser;
    }

    public String getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(String roleUser) {
        this.roleUser = roleUser;
    }

    public Boolean getStateUser() {
        return stateUser;
    }

    public void setStateUser(Boolean stateUser) {
        this.stateUser = stateUser;
    }
}
