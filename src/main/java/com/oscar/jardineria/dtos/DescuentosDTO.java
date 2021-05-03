package com.oscar.jardineria.dtos;

/**
 * @author Óscar Izquierdo
 * Fichero donde se almacenan todos las variables de los descuentos
 */

public class DescuentosDTO {

	
	public Integer id_descuentos;
	public Integer cantidad;
	public Integer descuento;

	public DescuentosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DescuentosDTO(Integer id_descuentos, Integer cantidad, Integer descuento) {
		super();
		this.id_descuentos = id_descuentos;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}

	public Integer getId_descuentos() {
		return id_descuentos;
	}

	public void setId_descuentos(Integer id_descuentos) {
		this.id_descuentos = id_descuentos;
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

	
}
