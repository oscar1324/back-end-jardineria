package com.oscar.jardineria.dtos;

public class DetallePresupuestoDTO {
	
	public int idDetallePresupuesto;
	public int idPresupuesos;
	public int idServicios; // Ver si puedo cambiarlo
	public DetallePresupuestoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DetallePresupuestoDTO(int idDetallePresupuesto, int idPresupuesos, int idServicios) {
		super();
		this.idDetallePresupuesto = idDetallePresupuesto;
		this.idPresupuesos = idPresupuesos;
		this.idServicios = idServicios;
	}
	public int getIdDetallePresupuesto() {
		return idDetallePresupuesto;
	}
	public void setIdDetallePresupuesto(int idDetallePresupuesto) {
		this.idDetallePresupuesto = idDetallePresupuesto;
	}
	public int getIdPresupuesos() {
		return idPresupuesos;
	}
	public void setIdPresupuesos(int idPresupuesos) {
		this.idPresupuesos = idPresupuesos;
	}
	public int getIdServicios() {
		return idServicios;
	}
	public void setIdServicios(int idServicios) {
		this.idServicios = idServicios;
	}
	
	


}
