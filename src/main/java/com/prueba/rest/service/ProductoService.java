package com.prueba.rest.service;

import java.util.List;

import com.prueba.rest.entidad.Producto;



public interface ProductoService {

	public List<Producto> listarTodoslosProductos();
	
	public Producto guardarProducto(Producto producto);
	
	public Producto obtenerProducto(Long id);
	
	public Producto actualizarProducto(Producto producto);
	
	public void eliminarProducto(Long id);
	
}
