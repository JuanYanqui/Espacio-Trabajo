package ista.Backed20.api.repository;

import ista.Backed20.api.entity.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Imagen, Long> {
    Optional<Imagen> findByName(String name);
}