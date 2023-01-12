package ista.Backed20.api.repository;

import ista.Backed20.api.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Productos, Long> {
    @Query(value = "SELECT * FROM productos WHERE productos.empresa_id_empresa = ?",
            nativeQuery = true
    )
    List<Productos> findAllProductosDelaEmpresa(long id_empresa);
}
