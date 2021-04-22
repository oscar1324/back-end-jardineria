package com.oscar.jardineria.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "presupuestos")
public class PresupuestosEntity {
	
	//Preguntar si tengo que relacionarlo con más entidades
	
	@Id
	@Column(name = "idPresupuestos")
	private Integer idPresupuestos;
	
	@Column(name = "cantidadTerreno")
	private Integer cantidadTerreno;
	
	@Column(name = "fechaPresupuesto")
	private Date fechaPresupuesto;
	
	@Column(name = "animales")
	private Integer animales;
	
	@Column(name = "comentario")
	private String comentario;
	// Conectar con users
	@Column(name = "username")
	private String username;

	public PresupuestosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PresupuestosEntity(Integer idPresupuestos, Integer cantidadTerreno, Date fechaPresupuesto, Integer animales,
			String comentario, String username) {
		super();
		this.idPresupuestos = idPresupuestos;
		this.cantidadTerreno = cantidadTerreno;
		this.fechaPresupuesto = fechaPresupuesto;
		this.animales = animales;
		this.comentario = comentario;
		this.username = username;
	}

	public Integer getIdPresupuestos() {
		return idPresupuestos;
	}

	public void setIdPresupuestos(Integer idPresupuestos) {
		this.idPresupuestos = idPresupuestos;
	}

	public Integer getCantidadTerreno() {
		return cantidadTerreno;
	}

	public void setCantidadTerreno(Integer cantidadTerreno) {
		this.cantidadTerreno = cantidadTerreno;
	}

	public Date getFechaPresupuesto() {
		return fechaPresupuesto;
	}

	public void setFechaPresupuesto(Date fechaPresupuesto) {
		this.fechaPresupuesto = fechaPresupuesto;
	}

	public Integer getAnimales() {
		return animales;
	}

	public void setAnimales(Integer animales) {
		this.animales = animales;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



}
