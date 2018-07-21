package com.cice.microserviciofeign.gestionproductos.service;

import com.cice.microserviciofeign.gestionproductos.entity.Producto;

import java.util.List;

public interface IGestionProducto {

    List<Producto> getIdProductosUsuario(Long idUsuario);

    boolean crearProducto(String descripcion, String precio, String idUsuario);

    boolean eliminarProducto(String id);
}
