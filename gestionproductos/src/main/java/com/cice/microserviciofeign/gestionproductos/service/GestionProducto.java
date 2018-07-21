package com.cice.microserviciofeign.gestionproductos.service;

import com.cice.microserviciofeign.gestionproductos.entity.Producto;
import com.cice.microserviciofeign.gestionproductos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionProducto implements IGestionProducto{

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Producto> getIdProductosUsuario(Long idUsuario){

        List<Producto> lista = productoRepository.findAllByidUsuario(idUsuario);
        System.out.println("Lista de productos por usuario:" + lista);
        return lista;
        }

    @Override
    public boolean crearProducto (String descripcion, String precio, String idUsuario){
        Producto producto = new Producto();
        producto.setDescripcion(descripcion);
        producto.setPrecio(Double.parseDouble(precio));
        producto.setIdUsuario(Long.parseLong(idUsuario));
        productoRepository.save(producto);
        return false;
    }

    @Override
    public boolean eliminarProducto(String id){
        return false;
    }

}
