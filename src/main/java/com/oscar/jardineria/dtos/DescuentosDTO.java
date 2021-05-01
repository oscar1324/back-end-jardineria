package com.oscar.jardineria.dtos;

/**
 * @author Óscar Izquierdo
 * Fichero donde se almacenan todos las variables de los descuentos
 */

public class DescuentosDTO {

	
	public Integer idDescuentos;
	public Integer cantidad;
	public Integer descuento;
	public String tipo;
	public DescuentosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DescuentosDTO(Integer idDescuentos, Integer cantidad, Integer descuento, String tipo) {
		super();
		this.idDescuentos = idDescuentos;
		this.cantidad = cantidad;
		this.descuento = descuento;
		this.tipo = tipo;
	}
	public Integer getIdDescuentos() {
		return idDescuentos;
	}
	public void setIdDescuentos(Integer idDescuentos) {
		this.idDescuentos = idDescuentos;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getDescuento() {
		return descuento;
	}
	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
