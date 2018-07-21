package com.cice.microserviciofeign.gestionproductos.rest;

import com.cice.microserviciofeign.gestionproductos.entity.Producto;
import com.cice.microserviciofeign.gestionproductos.rest.dto.ProductoDto;
import com.cice.microserviciofeign.gestionproductos.service.IGestionProducto;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;


@RestController("/")
public class ProductoResource {

    @Autowired
    IGestionProducto gestionProducto;

    @RequestMapping(value = "producto", method = RequestMethod.GET)
    public ResponseEntity<List<ProductoDto>> getAllProductos() {
        return null;
    }

    @RequestMapping(value = "producto/{idUsuario}", method = RequestMethod.GET)
    public ResponseEntity<List<ProductoDto>> getProductosByIdUsuario(@PathVariable Long idUsuario) {
        return null;
    }

    @RequestMapping(value = "producto/{idUsuario}",method = RequestMethod.POST)
    public ResponseEntity<Void> crearProductoParaUsuario(
            @RequestBody ProductoDto productoDto,
            @PathVariable Long idUsuario){
        //test
        return null;
    }

    @RequestMapping(value = "producto", method = RequestMethod.DELETE)
    public ResponseEntity<Void> eliminarProductosByIdUsuario(@PathVariable Long idUsuario){
        return null;
    }
}
