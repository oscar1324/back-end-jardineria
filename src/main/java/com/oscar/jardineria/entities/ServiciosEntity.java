package com.oscar.jardineria.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Óscar Izquierdo
 * Entidad de la tabla servicios de la base de datos jardineriasl
 */

@Entity
@Table(name = "servicios")
public class ServiciosEntity {
	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_servicios") 
	private Integer idServicios;
	
	@Column(name= "descripcion_servicio")
	private String descripcionServicio;
	
	@Column(name = "precio_metro")
	private Integer precioMetro;
	

	public ServiciosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ServiciosEntity(Integer idServicios, String descripcionServicio, Integer precioMetro) {
		super();
		this.idServicios = idServicios;
		this.descripcionServicio = descripcionServicio;
		this.precioMetro = precioMetro;
	}


	public Integer getIdServicios() {
		return idServicios;
	}


	public void setIdServicios(Integer idServicios) {
		this.idServicios = idServicios;
	}


	public String getDescripcionServicio() {
		return descripcionServicio;
	}


	public void setDescripcionServicio(String descripcionServicio) {
		this.descripcionServicio = descripcionServicio;
	}


	public Integer getPrecioMetro() {
		return precioMetro;
	}


	public void setPrecioMetro(Integer precioMetro) {
		this.precioMetro = precioMetro;
	}

		
	

}
