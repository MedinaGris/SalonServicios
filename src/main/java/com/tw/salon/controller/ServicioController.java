package com.tw.salon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
//import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.tw.salon.entity.Servicio;

import com.tw.salon.service.IServicioService;

//administra la comunicacion, se crean post, get put y delete de la clase servicio
//se hace el mapeo de la aplicacion, se definen los paths


@RestController 

public class ServicioController {
	@Autowired
	IServicioService service;
	
	@RequestMapping("/servicio-controller")//línea agregada para llamar al jsp home
	public void paginaPrincipal(ModelMap model) {
		System.out.println("hola");
		
	}
	
	
	@PostMapping("/crearServicio") 
	public void crearServicio(@RequestBody Servicio servicio){
		service.crearServicio(servicio);
	}
	
	
	
	@PutMapping("/modificarServicio/{idServicio}")
	public void actualizarServicio(@RequestBody Servicio servicio, @PathVariable("idServicio")Long idServicio) {
		servicio.setIdServicio(idServicio);
		service.actualizarServicio(servicio);
	}
	
	
	
	@DeleteMapping("/eliminarServicio/{idServicio}")
	public void eliminarUsuario(@PathVariable("idServicio")Long idServicio) {
		Servicio servicio= service.obtenerServicio(idServicio);
		service.eliminarServicio(servicio);
	}
	
	
	@GetMapping("/listarServicio")
	public List <Servicio> obtenerListaServicio(){
		return service.obtenerListaServicio();
	}
	
	@GetMapping("/mostrarUnServicio/{idServicio}")
	public Servicio obtenerServicio(@PathVariable("idServicio")Long idServicio){
		return service.obtenerServicio(idServicio);
	}
	
}
