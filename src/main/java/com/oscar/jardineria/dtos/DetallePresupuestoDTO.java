package com.oscar.jardineria.dtos;

public class DetallePresupuestoDTO {
	
	public Integer idDetallePresupuesto ;
	public Integer idServicios ;
	public Integer idPresupuestos ;
	public DetallePresupuestoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DetallePresupuestoDTO(Integer idDetallePresupuesto, Integer idServicios, Integer idPresupuestos) {
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
	public Integer getIdServicio() {
		return idServicios;
	}
	public void setIdServicio(Integer idServicios) {
		this.idServicios = idServicios;
	}
	public Integer getIdPresupuesto() {
		return idPresupuestos;
	}
	public void setIdPresupuesto(Integer idPresupuestos) {
		this.idPresupuestos = idPresupuestos;
	}
	
	

}
