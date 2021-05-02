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
	@Column(name ="idDetallePresupuesto")
	private Integer idDetallePresupuesto;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name =" idServicio")
	private ServiciosEntity idServicio;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn (name = "idPresupuestos")
	private PresupuestosEntity idPresupuestos;

	
	public DetallePresupuestosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DetallePresupuestosEntity(Integer idDetallePresupuesto, ServiciosEntity idServicio,
			PresupuestosEntity idPresupuestos) {
		super();
		this.idDetallePresupuesto = idDetallePresupuesto;
		this.idServicio = idServicio;
		this.idPresupuestos = idPresupuestos;
	}


	public Integer getIdDetallePresupuesto() {
		return idDetallePresupuesto;
	}


	public void setIdDetallePresupuesto(Integer idDetallePresupuesto) {
		this.idDetallePresupuesto = idDetallePresupuesto;
	}


	public ServiciosEntity getIdServicio() {
		return idServicio;
	}


	public void setIdServicio(ServiciosEntity idServicio) {
		this.idServicio = idServicio;
	}


	public PresupuestosEntity getIdPresupuestos() {
		return idPresupuestos;
	}


	public void setIdPresupuestos(PresupuestosEntity idPresupuestos) {
		this.idPresupuestos = idPresupuestos;
	}	
	
	
	
	

}
