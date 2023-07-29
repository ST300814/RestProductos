package com.prueba.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.prueba.rest.repository.ProductoRepositorio;



@SpringBootApplication
public class RestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}
	
	@Autowired
	private ProductoRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception{
		/*
		Producto producto1 = new Producto("Jabon");
		repositorio.save(producto1);
		
		Producto producto2 = new Producto("Shampo");
		repositorio.save(producto2);
		*/
	}

}
