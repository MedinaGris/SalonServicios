package com.tw.salon.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tw.salon.entity.Usuario;
//definicion de clase que genera crud de Usuario
@Repository//genera todo el crud
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}



