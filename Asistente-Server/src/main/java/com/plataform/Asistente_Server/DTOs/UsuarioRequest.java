package com.plataform.Asistente_Server.DTOs;
import com.plataform.Asistente_Server.Models.RolesModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UsuarioRequest {
    @NotBlank(message = "El nombre es obligatorio")
    private String nameUsuario;
    @NotBlank(message = "El apellido es obligatorio")
    private String lastnameUsuario;
    @NotBlank(message = "El DNI es obligatorio")
    @Size(min = 8, max = 8, message = "El DNI debe tener 8 caracteres")
    private String dniUsuario;
    @NotNull(message = "El rol es obligatorio")
    private RolesModel roleUsuario;
    @NotNull(message = "El habilitado es obligatorio")
    private Boolean ennableUsuario;
    @NotBlank(message = "El correo es obligatorio")
    private String emailUsuario;


    public UsuarioRequest() {
    }

    public UsuarioRequest(String nameUsuario, String lastnameUsuario, String dniUsuario, RolesModel roleUsuario, Boolean ennableUsuario, String emailUsuario) {
        this.nameUsuario = nameUsuario;
        this.lastnameUsuario = lastnameUsuario;
        this.dniUsuario = dniUsuario;
        this.roleUsuario = roleUsuario;
        this.ennableUsuario = ennableUsuario;
        this.emailUsuario = emailUsuario;
    }

    public @NotBlank(message = "El nombre es obligatorio") String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(@NotBlank(message = "El nombre es obligatorio") String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public @NotBlank(message = "El apellido es obligatorio") String getLastnameUsuario() {
        return lastnameUsuario;
    }

    public void setLastnameUsuario(@NotBlank(message = "El apellido es obligatorio") String lastnameUsuario) {
        this.lastnameUsuario = lastnameUsuario;
    }

    public @NotBlank(message = "El DNI es obligatorio") @Size(min = 8, max = 8, message = "El DNI debe tener 8 caracteres") String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(@NotBlank(message = "El DNI es obligatorio") @Size(min = 8, max = 8, message = "El DNI debe tener 8 caracteres") String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public @NotNull(message = "El rol es obligatorio") RolesModel getRoleUsuario() {
        return roleUsuario;
    }

    public void setRoleUsuario(@NotNull(message = "El rol es obligatorio") RolesModel roleUsuario) {
        this.roleUsuario = roleUsuario;
    }

    public @NotNull(message = "El habilitado es obligatorio") Boolean getEnnableUsuario() {
        return ennableUsuario;
    }

    public void setEnnableUsuario(@NotNull(message = "El habilitado es obligatorio") Boolean ennableUsuario) {
        this.ennableUsuario = ennableUsuario;
    }

    public @NotBlank(message = "El correo es obligatorio") String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(@NotBlank(message = "El correo es obligatorio") String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
}
