package com.unir.microservicio.productos.microsevicio_productos.dao;

import com.unir.microservicio.productos.microsevicio_productos.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoDAO extends JpaRepository<Producto, Integer> {
}
