package com.km.productoms.repository;

import com.km.productoms.service.List;
import com.km.productoms.service.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

	List<Producto> findAll();
}