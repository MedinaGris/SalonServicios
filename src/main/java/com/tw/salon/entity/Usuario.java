package com.tw.salon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
import lombok.Data;

@Entity//permite que esta clase se traduce a tabla en base de datos
@Table(name = "usuario")//renombrar la tabka en la base de datos
@Data //getter y setter 

//@NoArgsConstructor  
//@AllArgsConstructor

public class Usuario {
	@Id//llave primaria de la tabla
	@GeneratedValue(strategy=GenerationType.IDENTITY)//serial
	@Column(name="idUsuario") 	
	private long idUsuario;
	@Column(name="nombre",length=60,nullable=true)
	private String nombre;
	@Column(name="email",length=60, nullable=true)
	private String email;
	@Column(name="telefono",length=10,nullable=true)
	private String telefono;
	@Column(name="contrasena",length=8,nullable=true)
	private String contrasena;
	@Column(name="admin",nullable=true)
	private int admin;
	
	
}
