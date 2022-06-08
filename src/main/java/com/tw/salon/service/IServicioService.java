package com.tw.salon.service;
import java.util.List;

import com.tw.salon.entity.Servicio;

public interface IServicioService {
	public void crearServicio(Servicio servicio);
	public void actualizarServicio(Servicio servicio);
	public void eliminarServicio(Servicio servicio);
	public Servicio obtenerServicio(Long idServicio);
	public List<Servicio> obtenerListaServicio();

}
