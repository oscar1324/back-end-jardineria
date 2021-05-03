package com.oscar.jardineria.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "detallepresupuesto")
public class DetallePresupuestosEntity {
	
	@Id
	@Column(name ="idDetalle_presupuesto")
	private Integer idDetalle_presupuesto;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name =" id_servicio")
	private ServiciosEntity id_servicio;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn (name = "id_presupuestos")
	private PresupuestosEntity id_presupuestos;

	
	public DetallePresupuestosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DetallePresupuestosEntity(Integer idDetalle_presupuesto, ServiciosEntity id_servicio,
			PresupuestosEntity id_presupuestos) {
		super();
		this.idDetalle_presupuesto = idDetalle_presupuesto;
		this.id_servicio = id_servicio;
		this.id_presupuestos = id_presupuestos;
	}


	public Integer getIdDetalle_presupuesto() {
		return idDetalle_presupuesto;
	}


	public void setIdDetalle_presupuesto(Integer idDetalle_presupuesto) {
		this.idDetalle_presupuesto = idDetalle_presupuesto;
	}


	public ServiciosEntity getId_servicio() {
		return id_servicio;
	}


	public void setId_servicio(ServiciosEntity id_servicio) {
		this.id_servicio = id_servicio;
	}


	public PresupuestosEntity getId_presupuestos() {
		return id_presupuestos;
	}


	public void setId_presupuestos(PresupuestosEntity id_presupuestos) {
		this.id_presupuestos = id_presupuestos;
	}

	
	
	

}
