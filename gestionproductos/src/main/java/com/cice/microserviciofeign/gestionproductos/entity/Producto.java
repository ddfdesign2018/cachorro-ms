package com.cice.microserviciofeign.gestionproductos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name= "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    @GeneratedValue
    @Column(name ="id")
    private Long id;

    @Column(name = "idUsuario")
    private Long idUsuario;

    @Column(name ="nombre")
    private String nombre;

    @Column (name = "codigo")
    private String codigo;

    @Column(name ="precio")
    private Double precio;

}