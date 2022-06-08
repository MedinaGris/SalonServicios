package com.tw.salon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tw.salon.entity.Usuario;
import com.tw.salon.model.IUsuarioRepository;



@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioRepository repository ;
	
	@Override
	public void crearUsuario(Usuario usuario){
		repository.save(usuario);
		
	}

	@Override
	public void actualizarUsuario(Usuario usuario){
		repository.save(usuario);	
	}

	@Override
	public void eliminarUsuario(Usuario usuario){
		repository.delete(usuario);
		
	}

	@Override
	public Usuario obtenerUsuario(Long idUsuario){
		return repository.findById(idUsuario).get();
	}

	@Override
	public List<Usuario> obtenerListaUsuarios(){
		return repository.findAll (); 
	}

}
