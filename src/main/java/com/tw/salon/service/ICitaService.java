package com.tw.salon.service;

import java.util.List;

import com.tw.salon.entity.Cita;


public interface ICitaService {
	public void crearCita(Cita cita);
	public void actualizarCita(Cita cita);
	public void eliminarCita(Cita cita);
	public Cita obtenerCita(Long idCita);
	public List<Cita> obtenerListaCita();

}
