package com.plataform.Cursos_Server.DTOs;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ClientAsistenteRequestDTO {
    @NotBlank(message = "El nombre es obligatorio")
    private String nameAsistente;
    @NotBlank(message = "El apellido es obligatorio")
    private String lastnameAsistente;
    @NotBlank(message = "El DNI es obligatorio")
    @Size(min = 8, max = 8, message = "El DNI debe tener 8 caracteres")
    private String dniAsistente;
    @NotNull(message = "El rol es obligatorio")
    private String roleAsistente;
    @NotNull(message = "El habilitado es obligatorio")
    private Boolean ennableAsistente;
    @NotBlank(message = "El correo es obligatorio")
    private String emailAsistente;


    public ClientAsistenteRequestDTO() {
    }

    public ClientAsistenteRequestDTO(String nameAsistente, String lastnameAsistente, String dniAsistente, String roleAsistente, Boolean ennableAsistente, String emailAsistente) {
        this.nameAsistente = nameAsistente;
        this.lastnameAsistente = lastnameAsistente;
        this.dniAsistente = dniAsistente;
        this.roleAsistente = roleAsistente;
        this.ennableAsistente = ennableAsistente;
        this.emailAsistente = emailAsistente;
    }

    public @NotBlank(message = "El nombre es obligatorio") String getNameAsistente() {
        return nameAsistente;
    }

    public void setNameAsistente(@NotBlank(message = "El nombre es obligatorio") String nameAsistente) {
        this.nameAsistente = nameAsistente;
    }

    public @NotBlank(message = "El apellido es obligatorio") String getLastnameAsistente() {
        return lastnameAsistente;
    }

    public void setLastnameAsistente(@NotBlank(message = "El apellido es obligatorio") String lastnameAsistente) {
        this.lastnameAsistente = lastnameAsistente;
    }

    public @NotBlank(message = "El DNI es obligatorio") @Size(min = 8, max = 8, message = "El DNI debe tener 8 caracteres") String getDniAsistente() {
        return dniAsistente;
    }

    public void setDniAsistente(@NotBlank(message = "El DNI es obligatorio") @Size(min = 8, max = 8, message = "El DNI debe tener 8 caracteres") String dniAsistente) {
        this.dniAsistente = dniAsistente;
    }

    public @NotNull(message = "El rol es obligatorio") String getRoleAsistente() {
        return roleAsistente;
    }

    public void setRoleAsistente(@NotNull(message = "El rol es obligatorio") String roleAsistente) {
        this.roleAsistente = roleAsistente;
    }

    public @NotNull(message = "El habilitado es obligatorio") Boolean getEnnableAsistente() {
        return ennableAsistente;
    }

    public void setEnnableAsistente(@NotNull(message = "El habilitado es obligatorio") Boolean ennableAsistente) {
        this.ennableAsistente = ennableAsistente;
    }

    public @NotBlank(message = "El correo es obligatorio") String getEmailAsistente() {
        return emailAsistente;
    }

    public void setEmailAsistente(@NotBlank(message = "El correo es obligatorio") String emailAsistente) {
        this.emailAsistente = emailAsistente;
    }
}
