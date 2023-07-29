package com.prueba.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.rest.entidad.Producto;
import com.prueba.rest.repository.ProductoRepositorio;



@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepositorio repositorio;
	
	@Override
	public List <Producto> listarTodoslosProductos() {
		return repositorio.findAll();
	}
	
	@Override
	public Producto guardarProducto(Producto producto) {
		return repositorio.save(producto);
	}

	@Override
	public Producto obtenerProducto(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		return repositorio.save(producto);
	}

	@Override
	public void eliminarProducto(Long id) {
		repositorio.deleteById(id);
		
	}
	
}
