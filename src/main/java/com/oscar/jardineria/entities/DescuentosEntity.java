package com.oscar.jardineria.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * @author Óscar Izquierdo
 * Entidad de la tabla descuntos de la base de datos jardineriasl
 */

@Entity
@Table( name = "descuentos")
public class DescuentosEntity {
	
	@Id
	@Column(name = "id_descuentos")
	private Integer id_descuentos;
	
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@Column(name = "descuento")
	private Integer descuento;
	

	public DescuentosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DescuentosEntity(Integer id_descuentos, Integer cantidad, Integer descuento) {
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
