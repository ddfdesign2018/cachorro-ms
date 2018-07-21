package com.cice.microserviciofeign.gestionproductos.repository;

import com.cice.microserviciofeign.gestionproductos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findAllByidUsuario(Long idUsuario);
}
