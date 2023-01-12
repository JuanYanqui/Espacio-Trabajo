package ista.Backed20.api.repository;


import ista.Backed20.api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    //public Usuario findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByContrasenia(String contrasenia);

    Optional<Usuario> findByUsername(String username);
}
