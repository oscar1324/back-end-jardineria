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
	@Column(name = "idDescuentos")
	private Integer idDescuentos;
	
//	@Column(name ="idServicios") // referenciar tabla
//	private Integer idServicios;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idServicios") 
	private ServiciosEntity idServicios;
	
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

	public DescuentosEntity(Integer idDescuentos, ServiciosEntity idServicios, Integer cantidad, Integer descuento,
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

	public ServiciosEntity getIdServicios() {
		return idServicios;
	}

	public void setIdServicios(ServiciosEntity idServicios) {
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
