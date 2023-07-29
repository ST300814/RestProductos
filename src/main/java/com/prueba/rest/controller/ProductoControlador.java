package com.prueba.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.prueba.rest.entidad.Producto;
import com.prueba.rest.service.ProductoService;

@Controller
public class ProductoControlador {

	@Autowired
	private ProductoService servicio;

	@GetMapping({ "/Productos", "/" })
	public String listarProductos(Model model) {
		model.addAttribute("productos", servicio.listarTodoslosProductos());
		return "productos";
	}

	@GetMapping("/Productos/nuevo")
	public String mostrarFormularioDeRegistrarProducto(Model model) {
		Producto producto = new Producto();
		model.addAttribute("producto", producto);
		return "crear_producto";
	}

	@PostMapping("/Productos")
	public String guardarProducto(@ModelAttribute("producto") Producto producto) {
		servicio.guardarProducto(producto);
		return "redirect:Productos";
	}

	@GetMapping("/Productos/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model model) {
		model.addAttribute("producto", servicio.obtenerProducto(id));
		return "editar_producto";
	}

	@PostMapping("/Productos/{id}")
	public String actualizarProducto(@PathVariable Long id, @ModelAttribute("producto") Producto producto,
			Model model) {
		Producto productoExistente = servicio.obtenerProducto(id);
		productoExistente.setId(id);
		productoExistente.setNombre(producto.getNombre());
		servicio.actualizarProducto(productoExistente);
		return "redirect:/Productos";
	}

	@GetMapping("/Productos/{id}")
	public String eliminarProducto(@PathVariable Long id) {
		servicio.eliminarProducto(id);
		return "redirect:/Productos";
	}

}
