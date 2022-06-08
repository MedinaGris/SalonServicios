package com.tw.salon.service;
import java.util.List;

import com.tw.salon.entity.Usuario;

public interface IUsuarioService {
	public void crearUsuario(Usuario usuario);
	public void actualizarUsuario(Usuario usuario);
	public void eliminarUsuario(Usuario usuario);
	public Usuario obtenerUsuario(Long idUsuario);
	public List<Usuario> obtenerListaUsuarios();
}



