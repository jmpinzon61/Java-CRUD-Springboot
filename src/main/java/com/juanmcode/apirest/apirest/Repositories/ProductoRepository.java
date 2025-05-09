package com.juanmcode.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanmcode.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
