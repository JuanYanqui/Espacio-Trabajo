package ista.Backed20.api.repository;


import ista.Backed20.api.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RolRepository extends JpaRepository<Rol, Long> {
    @Query(value = "SELECT r.id_rol, r.descripcion,r.estado,r.nombre_rol FROM roles r, usuario u WHERE u.rol_id_rol = r.id_rol AND u.empresa_id_empresa = ?",
            nativeQuery = true
    )
    List<Rol> findAllRolesDelaEmpresa(long id_empresa);

}
