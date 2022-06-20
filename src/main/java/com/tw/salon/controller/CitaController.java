package com.tw.salon.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.tw.salon.entity.Cita;
//import com.tw.salon.model.ICitaRepository;
import com.tw.salon.service.ICitaService;



@RestController  // administra la comunicacion, se crean post, get put y delete
//@Controller 

public class CitaController {
	@Autowired
	ICitaService service;	

	
	@PostMapping("/crearCita") 
	public void crearCita(@RequestBody Cita cita) {
		service.crearCita(cita);
	}
	
	@PutMapping("/modificarCita/{idCita}") 
	public void actualizarCita(@RequestBody Cita cita, @PathVariable("idCita")Long idCita) {
		cita.setIdCita(idCita);
		service.actualizarCita(cita);
	}	
	
	@DeleteMapping("/eliminarCita/{idCita}") 
	public void eliminarCita(@PathVariable("idCita")Long idCita) {
		Cita cita= service.obtenerCita(idCita);
		service.eliminarCita(cita);
	}
	
	
	@GetMapping("/listarCitas")
	public List <Cita> obtenerListaCitas(){
		return service.obtenerListaCita();
	}
	
	@GetMapping("/mostrarCita/{idCita}")
	public Cita obtenerCita(@PathVariable("idCita")Long idCita){
		return service.obtenerCita(idCita);
		
	}


}
