package com.tw.salon.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tw.salon.model.IServicioRepository;
import com.tw.salon.entity.Servicio;

@Service
public class ServicioServiceImpl implements IServicioService {

	@Autowired
	private IServicioRepository repository ;
	
	@Override
	public void crearServicio(Servicio servicio) {
		repository.save(servicio);
		
	}

	@Override
	public void actualizarServicio(Servicio servicio) {
		repository.save(servicio);
		
	}

	@Override
	public void eliminarServicio(Servicio servicio) {
		repository.delete(servicio);
		
	}

	@Override
	public Servicio obtenerServicio(Long idServicio) {
		return repository.findById(idServicio).get();
	}

	@Override
	public List<Servicio> obtenerListaServicio() {
		return repository.findAll (); 
	}

}
