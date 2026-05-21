package com.plataform.MaterialCurso_Server.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

public class MaterialCursoRequest {

    @NotNull(message = "La asignación curso-asistente es obligatoria")
    private Long asignacionCuAsId;

    @NotBlank(message = "El título es obligatorio")
    @Size(max = 200, message = "El título no debe superar los 200 caracteres")
    private String tituloMaterial;

    @Size(max = 500, message = "La descripción no debe superar los 500 caracteres")
    private String descripcionMaterial;

    @Size(max = 100, message = "El tipo no debe superar los 100 caracteres")
    private String tipoMaterial;

    @Size(max = 50, message = "El estado no debe superar los 50 caracteres")
    private String estadoMaterial;

    @Size(max = 300, message = "La URL no debe superar los 300 caracteres")
    private String urlMaterial;

    private LocalDate fechaSubida;

    public Long getAsignacionCuAsId() { return asignacionCuAsId; }
    public void setAsignacionCuAsId(Long asignacionCuAsId) { this.asignacionCuAsId = asignacionCuAsId; }

    public String getTituloMaterial() { return tituloMaterial; }
    public void setTituloMaterial(String tituloMaterial) { this.tituloMaterial = tituloMaterial; }

    public String getDescripcionMaterial() { return descripcionMaterial; }
    public void setDescripcionMaterial(String descripcionMaterial) { this.descripcionMaterial = descripcionMaterial; }

    public String getTipoMaterial() { return tipoMaterial; }
    public void setTipoMaterial(String tipoMaterial) { this.tipoMaterial = tipoMaterial; }

    public String getEstadoMaterial() { return estadoMaterial; }
    public void setEstadoMaterial(String estadoMaterial) { this.estadoMaterial = estadoMaterial; }

    public String getUrlMaterial() { return urlMaterial; }
    public void setUrlMaterial(String urlMaterial) { this.urlMaterial = urlMaterial; }

    public LocalDate getFechaSubida() { return fechaSubida; }
    public void setFechaSubida(LocalDate fechaSubida) { this.fechaSubida = fechaSubida; }
}
