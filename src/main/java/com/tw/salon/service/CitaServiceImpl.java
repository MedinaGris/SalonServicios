package com.tw.salon.service;
//clase que genera los servicios de cita
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tw.salon.entity.Cita;

import com.tw.salon.model.ICitaRepository;


@Service
public class CitaServiceImpl implements ICitaService{

	@Autowired
	private ICitaRepository repository ;

	@Override
	public void crearCita(Cita cita) {//creacion de cita
		repository.save(cita);
		
	}

	@Override
	public void actualizarCita(Cita cita) {//actuzalizacion de cita
		repository.save(cita);
		
	}

	@Override
	public void eliminarCita(Cita cita) {//eliminacion de cita
		repository.delete(cita);
		
	}

	@Override
	public Cita obtenerCita(Long idCita) {//obtener una cita
		return repository.findById(idCita).get();
	}

	@Override
	public List<Cita> obtenerListaCita() {//obtener todas las citas
		return (List<Cita>) repository.findAll ();
	}
	
	
}
