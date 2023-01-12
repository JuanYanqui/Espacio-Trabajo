package ista.Backed20.api.controller;

import ista.Backed20.api.entity.Empresa;
import ista.Backed20.api.entity.Persona;
import ista.Backed20.api.entity.Rol;
import ista.Backed20.api.entity.Usuario;
import ista.Backed20.api.repository.PersonaRepository;
import ista.Backed20.api.security.AuthRequest;
import ista.Backed20.api.security.AuthResponse;
import ista.Backed20.api.security.JwtTokenUtil;
import ista.Backed20.api.service.EmpresaService;
import ista.Backed20.api.service.PersonaService;
import ista.Backed20.api.service.RolServiceImpl;
import ista.Backed20.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    private PersonaService personaService;

    @Autowired
	private RolServiceImpl rolService;

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/listarusuario")
    public ResponseEntity<List<Usuario>> listarUsuario(){
        return new ResponseEntity<>(usuarioService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/guardarUsuario")
    public ResponseEntity <Usuario> guardarUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.guardarUsuario(usuario), HttpStatus.CREATED);
    }

    @GetMapping("/lpersonas")
    public ResponseEntity<List<Persona>> listarPersona(){
        return new ResponseEntity<>(personaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/lroles")
    public ResponseEntity<List<Rol>> listarRol(){
        return new ResponseEntity<>(rolService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/lempresa")
    public ResponseEntity<List<Empresa>> listarcompra(){
        return new ResponseEntity<>(empresaService.findAll(), HttpStatus.OK);
    }
    

    @GetMapping("/{username}")
    public Usuario obtenerUsuario(@PathVariable("username") String username){
        return usuarioService.obtenerUsuario(username);
    }


    @GetMapping("/traerDatos/{cedula}")
    public ResponseEntity<List<?>> TraerDatosPersona(@PathVariable("cedula") String cedula) {
        return ResponseEntity.ok(usuarioService.buscarPerson(cedula));

    }






}
