package com.tw.salon.controller;

//administra la comunicacion, se crean post, get put y delete de la clase usuario
//se hace el mapeo de la aplicacion, se definen los paths


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.tw.salon.entity.Response;
import com.tw.salon.entity.Usuario;
import com.tw.salon.entity.UsuarioLogin;
import com.tw.salon.service.IUsuarioService;

@CrossOrigin(origins = "*")
@RestController  

//@Controller 
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
	
	@PostMapping("/login") 
	public Response login(@RequestBody UsuarioLogin usuario) {
		Response r=new Response();
		r.setResult("error");
		r.setStatus("error");
		List <Usuario> usuarios = service.obtenerListaUsuarios();
		for(Usuario u:usuarios) {
			if(u.getEmail().equals(u.getEmail())&&u.getContrasena().equals(usuario.getContrasena())) {
				System.out.println("validando..");
				r.setResult("ok");
				r.setStatus("ok");
				return r;
			}
			System.out.println("---------------val"+u.getEmail()+"-"+usuario.getEmail()+"//"+u.getContrasena()+"--"+usuario.getContrasena());
		}
		return r;
	}
	

}

