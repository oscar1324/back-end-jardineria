package com.oscar.jardineria.dtos;

public class DescuentosDTO {

	
	public int idDescuentos;
	public int idServicios;
	public int cantidad;
	public int descuento;
	public int tipo;
	public DescuentosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DescuentosDTO(int idDescuentos, int idServicios, int cantidad, int descuento, int tipo) {
		super();
		this.idDescuentos = idDescuentos;
		this.idServicios = idServicios;
		this.cantidad = cantidad;
		this.descuento = descuento;
		this.tipo = tipo;
	}
	public int getIdDescuentos() {
		return idDescuentos;
	}
	public void setIdDescuentos(int idDescuentos) {
		this.idDescuentos = idDescuentos;
	}
	public int getIdServicios() {
		return idServicios;
	}
	public void setIdServicios(int idServicios) {
		this.idServicios = idServicios;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
