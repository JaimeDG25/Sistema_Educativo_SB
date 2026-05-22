package com.plataform.Asignacion_Curso_Asistente_Server.Service;
import com.plataform.Asignacion_Curso_Asistente_Server.Client.AsistenteClient;
import com.plataform.Asignacion_Curso_Asistente_Server.Client.CursoClient;
import com.plataform.Asignacion_Curso_Asistente_Server.DTO.AsignacionRequestDTO;
import com.plataform.Asignacion_Curso_Asistente_Server.DTO.AsignacionResponseDTO;
import com.plataform.Asignacion_Curso_Asistente_Server.DTO.CursoClientDTO;
import com.plataform.Asignacion_Curso_Asistente_Server.DTO.UsuarioClientDTO;
import com.plataform.Asignacion_Curso_Asistente_Server.Model.AsignacionModel;
import com.plataform.Asignacion_Curso_Asistente_Server.Repository.AsignacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AsignacionService {
    @Autowired
    private AsignacionRepository repository;
    @Autowired
    private AsistenteClient asistenteClient;
    @Autowired
    private CursoClient cursoClient;
    //public Optional<AsignacionModel> buscarAsignacionPorId(Long id){return repository.findById(id);}

    public List<AsignacionModel> listarAsignacion (){return repository.findAll();}
    public AsignacionResponseDTO buscarAsignacionId(Long id){
        AsignacionModel asignacion = repository.findById(id).
                orElseThrow(() -> new RuntimeException("Asignacion no encontrada"));
        UsuarioClientDTO asistente =
                asistenteClient.buscarAsistentePorId(asignacion.getAsistenteId());
        CursoClientDTO curso =
                cursoClient.buscarCursoPorId(asignacion.getCursoId());
        return new AsignacionResponseDTO(
                asignacion.getIdAsignacion(),
                asistente,
                curso,
                asignacion.getFechaAsignacion()
        );
    }

    public AsignacionResponseDTO registrar(AsignacionRequestDTO request){
        UsuarioClientDTO asistente = asistenteClient.buscarAsistentePorId(request.getIdAsistente());
        CursoClientDTO curso = cursoClient.buscarCursoPorId(request.getIdCurso());
        if(asistente == null){throw new RuntimeException("Asistente no encontrado");}
        if(curso == null){throw new RuntimeException("Curso no encontrado");}
        AsignacionModel asignacion = new AsignacionModel();
        asignacion.setAsistenteId(request.getIdAsistente());
        asignacion.setCursoId(request.getIdCurso());
        asignacion.setFechaAsignacion(LocalDate.now());
        repository.save(asignacion);
        return new AsignacionResponseDTO(
                asignacion.getIdAsignacion(),
                asistente,
                curso,
                asignacion.getFechaAsignacion()
        );
    }
}
