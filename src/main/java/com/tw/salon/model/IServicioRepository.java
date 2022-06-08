package com.tw.salon.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tw.salon.entity.Servicio;

@Repository//genera todo el crud

public interface IServicioRepository extends JpaRepository<Servicio, Long> {

}
