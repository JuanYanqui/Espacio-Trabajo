package ista.Backed20.api.service;


import ista.Backed20.api.entity.Persona;
import ista.Backed20.api.repository.PersonaRepository;
import ista.Backed20.api.repository.UsuarioRepository;
import ista.Backed20.api.entity.Usuario;
import lombok.Lombok;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PersonaRepository personaRepository;


    // Esto es pa incriptar CONSTRASEÑAS
    
    private final PasswordEncoder passwordEncoder;
    
    public UsuarioServiceImpl (UsuarioRepository usuarioRepository) {
    	this.usuarioRepository = usuarioRepository;
    	this.passwordEncoder = new BCryptPasswordEncoder();
    }
    
    @Override
	public Usuario guardarUsuario(Usuario usuario) {
		//Usuario usuarioLocal= usuarioRepository.findByUsername(usuario.getUsername());

      //  if(usuarioLocal!=null){
            //System.out.println("El usuario ya existe");
        //}else{
        	
        	///String encoderPassword = this.passwordEncoder.encode(usuario.getContrasenia());
            //usuario.setContrasenia(encoderPassword);
        	//usuario = usuarioRepository.save(usuario);

        //}
        return usuarioRepository.save(usuario);
	}
  
    @Override
    public void eliminarUsuario(Long id_usuario){
        usuarioRepository.deleteById(id_usuario);
    }


	

	@Override
	public Usuario obtenerUsuario(String username) {
		// TODO Auto-generated method stub
		return null;//usuarioRepository.findByUsername(username);
	}



    @Override
    @Transactional(readOnly= true)
    public List<Usuario> findAll() {
        // TODO Auto-generated method stub
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public List<?> buscarPerson(String cedula) {
        return personaRepository.buscarPerson(cedula);
    }


}
