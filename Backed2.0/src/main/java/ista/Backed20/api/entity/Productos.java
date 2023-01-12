package ista.Backed20.api.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_producto;
    private double precio;
    private String nombre;
    private String descripcion;
    private String tipo_Producto;
    private String tipo_Iva;
    private String ice;
    private String stock;
    private String categoria;
    private Date fecha_Vencimiento;
    private String unidad;
    private String foto;

    @ManyToOne(fetch = FetchType.EAGER)
    private Empresa empresa;

    public Productos() {
    }

    public Productos(long id_producto, double precio, String nombre, String descripcion, String tipo_Producto, String tipo_Iva, String ice, String stock, String categoria, Date fecha_Vencimiento, String unidad, String foto) {
        this.id_producto = id_producto;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo_Producto = tipo_Producto;
        this.tipo_Iva = tipo_Iva;
        this.ice = ice;
        this.stock = stock;
        this.categoria = categoria;
        this.fecha_Vencimiento = fecha_Vencimiento;
        this.unidad = unidad;
        this.foto = foto;
    }

    public long getId_producto() {
        return id_producto;
    }

    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_Producto() {
        return tipo_Producto;
    }

    public void setTipo_Producto(String tipo_Producto) {
        this.tipo_Producto = tipo_Producto;
    }

    public String getTipo_Iva() {
        return tipo_Iva;
    }

    public void setTipo_Iva(String tipo_Iva) {
        this.tipo_Iva = tipo_Iva;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getFecha_Vencimiento() {
        return fecha_Vencimiento;
    }

    public void setFecha_Vencimiento(Date fecha_Vencimiento) {
        this.fecha_Vencimiento = fecha_Vencimiento;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
