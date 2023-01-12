package ista.Backed20.api.service;

import ista.Backed20.api.entity.Productos;
import ista.Backed20.api.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Productos> findAll() {
        return (List<Productos>) productoRepository.findAll();
    }

    @Override
    public Productos save(Productos productos) {
        return productoRepository.save(productos);
    }

    @Override
    public Productos findById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        productoRepository.deleteById(id);
    }

    public boolean actualizarProducto (Productos productos) {
        Optional<Productos> exists = productoRepository.findById(productos.getId_producto());
        if (exists.isPresent()) {
            Productos productoActual = exists.get();
            productoActual.setNombre(productos.getNombre());
            productoActual.setDescripcion(productos.getDescripcion());
            productoActual.setTipo_Producto(productos.getTipo_Producto());
            productoActual.setTipo_Iva(productos.getTipo_Iva());
            productoActual.setIce(productos.getIce());
            productoActual.setStock(productos.getStock());
            productoActual.setCategoria(productos.getCategoria());
            productoActual.setFecha_Vencimiento(productos.getFecha_Vencimiento());
            productoActual.setUnidad(productos.getUnidad());
            productoActual.setPrecio(productos.getPrecio());
            productoActual.setFoto(productos.getFoto());

            productoRepository.save(productoActual);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Productos> findAllProductosDelaEmpresa(long id_empresa) {
        return (List<Productos>) productoRepository.findAllProductosDelaEmpresa(id_empresa);
    }
}
