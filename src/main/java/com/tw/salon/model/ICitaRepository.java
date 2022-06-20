package com.tw.salon.model;
import org.springframework.data.repository.CrudRepository;

import com.tw.salon.entity.Cita;
//definición de clase que genera crud de la entidad Cita

public interface ICitaRepository  extends CrudRepository <Cita, Long>{
	
}
