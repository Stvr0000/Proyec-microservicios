package com.km.productoms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.km.productoms.repository.ProductoRepository;

@Service
public class ProductoService {
  
  @Autowired
  private ProductoRepository productoRepository;
  
  public List<Producto> getAllProductos() {
    return productoRepository.findAll();
  }
  
  public Producto getProductoById(Long id) {
    return productoRepository.findById(id).orElseThrow();
  }
  
  public Producto crearProducto(Producto producto) {
    return productoRepository.save(producto);
  }
  
  public Producto actualizarProducto(Producto producto) {
    return productoRepository.save(producto);
  }
  
  public void eliminarProducto(Long id) {
    productoRepository.deleteById(id);
  }
}