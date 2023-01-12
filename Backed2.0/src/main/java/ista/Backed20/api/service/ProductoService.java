package ista.Backed20.api.service;


import ista.Backed20.api.entity.Productos;

import java.util.List;

public interface ProductoService {

    public Productos save(Productos productos);

    public Productos findById(Long id);


    public List<Productos> findAll();

    public void delete(Long id);

    public List<Productos> findAllProductosDelaEmpresa(long id_empresa);
}
