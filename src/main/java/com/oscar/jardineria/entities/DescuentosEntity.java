package com.oscar.jardineria.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "descuentos")
public class DescuentosEntity {
	
	@Id
	@Column(name = "idDescuentos")
	private Integer idDescuentos;
	
	@Column(name ="idServicios") // referenciar tabla
	private Integer idServicios;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@Column(name = "descuento")
	private Integer descuento;
	
	@Column (name = "tipo")
	private String tipo;

	public DescuentosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DescuentosEntity(Integer idDescuentos, Integer idServicios, Integer cantidad, Integer descuento,
			String tipo) {
		super();
		this.idDescuentos = idDescuentos;
		this.idServicios = idServicios;
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

	public Integer getIdServicios() {
		return idServicios;
	}

	public void setIdServicios(Integer idServicios) {
		this.idServicios = idServicios;
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
