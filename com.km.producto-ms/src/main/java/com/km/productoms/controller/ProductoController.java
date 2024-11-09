package com.km.productoms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.km.productoms.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
  
  @Autowired
  private ProductoService productoService;
  
  @GetMapping
  public List<Producto> getAllProductos() {
    return productoService.getAllProductos();
  }
  
  @GetMapping("/{id}")
  public Producto getProductoById(@PathVariable Long id) {
    return productoService.getProductoById(id);
  }
  
  @PostMapping
  public Producto crearProducto(@RequestBody Producto producto) {
    return productoService.crearProducto(producto);
  }
  
  @PutMapping("/{id}")
  public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {
    producto.setId(id);
    return productoService.actualizarProducto(producto);
  }
  
  @DeleteMapping("/{id
		  
		  