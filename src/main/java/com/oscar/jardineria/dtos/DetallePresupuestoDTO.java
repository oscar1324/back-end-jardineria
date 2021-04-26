package com.oscar.jardineria.dtos;

public class DetallePresupuestoDTO {
	
	public Integer idDetallePresupuesto;
	public Integer idPresupuesos;
	public Integer idServicios; // Ver si puedo cambiarlo
	public DetallePresupuestoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DetallePresupuestoDTO(Integer idDetallePresupuesto, Integer idPresupuesos, Integer idServicios) {
		super();
		this.idDetallePresupuesto = idDetallePresupuesto;
		this.idPresupuesos = idPresupuesos;
		this.idServicios = idServicios;
	}
	public Integer getIdDetallePresupuesto() {
		return idDetallePresupuesto;
	}
	public void setIdDetallePresupuesto(Integer idDetallePresupuesto) {
		this.idDetallePresupuesto = idDetallePresupuesto;
	}
	public Integer getIdPresupuesos() {
		return idPresupuesos;
	}
	public void setIdPresupuesos(Integer idPresupuesos) {
		this.idPresupuesos = idPresupuesos;
	}
	public Integer getIdServicios() {
		return idServicios;
	}
	public void setIdServicios(Integer idServicios) {
		this.idServicios = idServicios;
	}
	
	


}
