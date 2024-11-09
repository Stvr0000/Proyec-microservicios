package com.km.productoms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String nombre;
  
  private Double precio;
  
  public Producto() {}
  
  public Producto(Long id, String nombre, Double precio) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
  }
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public Double getPrecio() {
    return precio;
  }
  
  public void setPrecio(Double precio) {
    this.precio = precio;
  }
  
  @Override
  public String toString() {
    return "Producto{" +
            "id=" + id +
            ", nombre='" + nombre + '\'' +
            ", precio=" + precio +
            '}';
  }
}