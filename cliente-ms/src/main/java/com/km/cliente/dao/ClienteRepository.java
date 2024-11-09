package com.km.cliente.dao;

import com.km.cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // Método para encontrar clientes por nombre
    List<Cliente> findByNombre(String nombre);

    // Método para encontrar clientes por apellido
    List<Cliente> findByApellido(String apellido);

    // Método para encontrar clientes por email
    List<Cliente> findByEmail(String email);
}