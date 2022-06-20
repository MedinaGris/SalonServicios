package com.tw.salon.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//import lombok.AllArgsConstructor;
import lombok.Data;
// clase donde se define el objeto cita
@Entity
@Table(name = "Cita")
@Data //getter y setter 

public class Cita {
	@Id//llave primaria de la tabla
	@GeneratedValue(strategy=GenerationType.IDENTITY)//serial
	@Column(name="idCita") 	
	private long idCita;
	@Column(name="nombre",length=60,nullable=true)
	private String nombre;
	@Column(name="email",length=60, nullable=true)
	private String email;
	@Column(name="fecha", length=50, nullable=true)
	private String fecha;
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="id_Usuario", referencedColumnName= "idUsuario")
	private Usuario usuario;
	
	
	
}
