package com.plataform.MaterialCurso_Server.Models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "material_curso")
public class MaterialCursoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_material")
    private Long idMaterial;

    // Guardamos solo el ID de la asignación, no la relación completa
    @Column(name = "asignacion_cu_as_id", nullable = false)
    private Long asignacionCuAsId;

    @Column(name = "titulo_material", nullable = false, length = 200)
    private String tituloMaterial;

    @Column(name = "descripcion_material", length = 500)
    private String descripcionMaterial;

    @Column(name = "tipo_material", length = 100)
    private String tipoMaterial;

    @Column(name = "estado_material", length = 50)
    private String estadoMaterial;

    @Column(name = "url_material", length = 300)
    private String urlMaterial;

    @Column(name = "fecha_subida")
    private LocalDate fechaSubida;

    // Getters y Setters
    public Long getIdMaterial() { return idMaterial; }
    public void setIdMaterial(Long idMaterial) { this.idMaterial = idMaterial; }

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
