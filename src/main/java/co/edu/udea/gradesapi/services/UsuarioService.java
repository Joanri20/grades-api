package co.edu.udea.gradesapi.services;

import co.edu.udea.gradesapi.models.UsuarioModel;
import co.edu.udea.gradesapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();

    }

    public UsuarioModel saveUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
}
