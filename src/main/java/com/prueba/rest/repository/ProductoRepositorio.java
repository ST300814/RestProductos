package com.prueba.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.rest.entidad.Producto;



@Repository
public interface ProductoRepositorio extends JpaRepository <Producto, Long>{

}
