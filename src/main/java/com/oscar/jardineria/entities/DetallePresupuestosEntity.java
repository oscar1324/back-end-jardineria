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
	@Column(name ="id_detalle_presupuesto")
	private Integer idDetalle_presupuesto;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST) 
	@JoinColumn(name =" id_servicios")
	private ServiciosEntity id_servicios;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST) 
	@JoinColumn (name = "id_presupuestos")
	private PresupuestosEntity id_presupuestos;


	public DetallePresupuestosEntity(Integer idDetalle_presupuesto, ServiciosEntity id_servicios,
			PresupuestosEntity id_presupuestos) {
		super();
		this.idDetalle_presupuesto = idDetalle_presupuesto;
		this.id_servicios = id_servicios;
		this.id_presupuestos = id_presupuestos;
	}


	public DetallePresupuestosEntity() {
		super();
	}


	public Integer getIdDetalle_presupuesto() {
		return idDetalle_presupuesto;
	}


	public void setIdDetalle_presupuesto(Integer idDetalle_presupuesto) {
		this.idDetalle_presupuesto = idDetalle_presupuesto;
	}


	public ServiciosEntity getId_servicios() {
		return id_servicios;
	}


	public void setId_servicios(ServiciosEntity id_servicios) {
		this.id_servicios = id_servicios;
	}


	public PresupuestosEntity getId_presupuestos() {
		return id_presupuestos;
	}


	public void setId_presupuestos(PresupuestosEntity id_presupuestos) {
		this.id_presupuestos = id_presupuestos;
	}
	
	
}