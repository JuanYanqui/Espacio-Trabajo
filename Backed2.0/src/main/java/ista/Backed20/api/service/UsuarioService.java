package ista.Backed20.api.service;

import ista.Backed20.api.entity.Persona;
import ista.Backed20.api.entity.Rol;
import ista.Backed20.api.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario);
    
    public Usuario obtenerUsuario(String username);
    
    public void eliminarUsuario(Long id_usuario);


    public List<Usuario> findAll();
    List<?> buscarPerson(String cedula);




}
