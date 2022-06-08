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
@Table(name = "servicio")//renombrar la tabka en la base de datos
@Data //getter y setter 

//@NoArgsConstructor  
//@AllArgsConstructor

public class Servicio {
	@Id//llave primaria de la tabla
	@GeneratedValue(strategy=GenerationType.IDENTITY)//serial
	@Column(name="idServicio") 	
	private long idServicio;
	@Column(name="nombre",length=60,nullable=true)
	private String nombre;
	@Column(name="precio", nullable=true)
	private double precio;

}
