package com.km.ventasms.repository;

import com.km.ventasms.model.venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<venta, Long> {
}
