package com.plataform.Asignacion_Curso_Asistente_Server.DTO;

public class AsignacionRequestDTO {
    private Long idAsistente;
    private Long idCurso;

    public AsignacionRequestDTO() {}
    public AsignacionRequestDTO(Long idAsistente, Long idCurso) {
        this.idAsistente = idAsistente;
        this.idCurso = idCurso;
    }

    public Long getIdAsistente() {
        return idAsistente;
    }

    public void setIdAsistente(Long idAsistente) {
        this.idAsistente = idAsistente;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }
}
