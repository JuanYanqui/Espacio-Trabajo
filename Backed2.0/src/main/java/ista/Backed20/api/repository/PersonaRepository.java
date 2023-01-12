package ista.Backed20.api.repository;


import ista.Backed20.api.entity.Persona;
import ista.Backed20.api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    @Query(value = "SELECT persona.id_persona FROM persona WHERE cedula = ?",
            nativeQuery = true
    )
    List<?> buscarPerson(String cedula);


}
