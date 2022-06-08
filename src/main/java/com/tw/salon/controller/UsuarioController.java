package com.tw.salon.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tw.salon.entity.Usuario;
import com.tw.salon.service.IUsuarioService;


@RestController  // administra la comunicacion, se crean post, get put y delete ---se eliminaron
//@RequestMapping("/materia") // es la base del path --- se eliminaron

//@Controller //agregada esta linea
public class UsuarioController {
	@Autowired
	IUsuarioService service;	
	
	@PostMapping("/crearUsuario") 
	public void crearUsuario(@RequestBody Usuario usuario) {
		service.crearUsuario(usuario);
	}
	
	@PutMapping("/modificarUsuario/{idUsuario}") //lo que va entre llaves hace referencia a una variable
	// url:  /materia/modificar/005-- (ejemplo de url a enviar)
	public void actualizarUsuario(@RequestBody Usuario usuario, @PathVariable("idUsuario")Long idUsuario) {
		usuario.setIdUsuario(idUsuario);
		service.actualizarUsuario(usuario);
	}	
	
	@DeleteMapping("/eliminarUsuario/{idUsuario}") 
	public void eliminarUsuario(@PathVariable("idUsuario")Long idUsuario) {
		Usuario usuario= service.obtenerUsuario(idUsuario);
		service.eliminarUsuario(usuario);
	}
	
	
	@GetMapping("/listarUsuarios")
	public List <Usuario> obtenerListaUsuarios(){
		return service.obtenerListaUsuarios();
	}
	
	@GetMapping("/mostrarUsuario/{idUsuario}")
	public Usuario obtenerUsuario(@PathVariable("idUsuario")Long idUsuario){
		return service.obtenerUsuario(idUsuario);
		
	}
	
	@GetMapping("/mostrarUsuario")
	public String obtenerUsuario(){
		return "nksdbj";
		
	}
}

