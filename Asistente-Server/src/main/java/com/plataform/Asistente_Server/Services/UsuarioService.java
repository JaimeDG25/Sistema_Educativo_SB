package com.plataform.Asistente_Server.Services;

import com.plataform.Asistente_Server.DTOs.UsuarioRequest;
import com.plataform.Asistente_Server.DTOs.UsuarioResponse;
import com.plataform.Asistente_Server.Models.UsuarioModel;
import com.plataform.Asistente_Server.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repositorioUsuario;

    public List<UsuarioModel>listarUsuarios(){
        return repositorioUsuario.findAll();
    }
    public Optional<UsuarioModel> buscarUsuarioId(Long id){
        return repositorioUsuario.findById(id);
    }
    public Optional<UsuarioModel> buscarUsuarioDni(String dni){
        return repositorioUsuario.findByDniUsuario(dni);
    }

    public UsuarioResponse agregarUsuario(UsuarioRequest request){
        Optional<UsuarioModel> consulta;
        consulta = repositorioUsuario.findByDniUsuario(request.getDniUsuario());
        if (consulta.isPresent()) {
            throw new RuntimeException("El usuario ya está registrado");
        }
        UsuarioModel model=new UsuarioModel();
        model.setNombreUsuario(request.getNameUsuario());
        model.setApellidoUsuario(request.getLastnameUsuario());
        model.setDniUsuario(request.getDniUsuario());
        model.setCorreoUsuario(request.getEmailUsuario());
        model.setHabilitadoUsuario(request.getEnnableUsuario());
        model.setRolesUsuario(request.getRoleUsuario());
        UsuarioModel guardarUsuario= repositorioUsuario.save(model);
        UsuarioResponse response=new UsuarioResponse();
        response.setNameUser(guardarUsuario.getNombreUsuario());
        response.setLastnameUser(guardarUsuario.getApellidoUsuario());
        response.setDniUser(guardarUsuario.getDniUsuario());
        response.setStateUser(guardarUsuario.getHabilitadoUsuario());
        response.setRoleUser(guardarUsuario.getRolesUsuario().getDescripcion());
        return response;
    }

    public String eliminarUusario(Long id){
        if (repositorioUsuario.existsById(id)) {
            repositorioUsuario.deleteById(id);
            return "Usuario eliminado correctamente";
        } else {
            return "El usuario no existeexiste";
        }
    }
}
