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
	private Integer idDetallePresupuesto;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST) 
	@JoinColumn(name =" id_servicios")
	private ServiciosEntity idServicios;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST) 
	@JoinColumn (name = "id_presupuestos")
	private PresupuestosEntity idPresupuestos;

	public DetallePresupuestosEntity(Integer idDetallePresupuesto, ServiciosEntity idServicios,
			PresupuestosEntity idPresupuestos) {
		super();
		this.idDetallePresupuesto = idDetallePresupuesto;
		this.idServicios = idServicios;
		this.idPresupuestos = idPresupuestos;
	}

	public Integer getIdDetallePresupuesto() {
		return idDetallePresupuesto;
	}

	public void setIdDetallePresupuesto(Integer idDetallePresupuesto) {
		this.idDetallePresupuesto = idDetallePresupuesto;
	}

	public ServiciosEntity getIdServicios() {
		return idServicios;
	}

	public void setIdServicios(ServiciosEntity idServicios) {
		this.idServicios = idServicios;
	}

	public PresupuestosEntity getIdPresupuestos() {
		return idPresupuestos;
	}

	public void setIdPresupuestos(PresupuestosEntity idPresupuestos) {
		this.idPresupuestos = idPresupuestos;
	}



	
}