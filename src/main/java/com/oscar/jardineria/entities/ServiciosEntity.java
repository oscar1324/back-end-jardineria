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
	private Integer id_servicios;
	
	@Column(name= "descripcion_servicio")
	private String descripcion_servicio;
	
	@Column(name = "precio_metro")
	private Integer precio_metro;

	public ServiciosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiciosEntity(Integer id_servicios, String descripcion_servicio, Integer precio_metro) {
		super();
		this.id_servicios = id_servicios;
		this.descripcion_servicio = descripcion_servicio;
		this.precio_metro = precio_metro;
	}

	public Integer getId_servicios() {
		return id_servicios;
	}

	public void setId_servicios(Integer id_servicios) {
		this.id_servicios = id_servicios;
	}

	public String getDescripcion_servicio() {
		return descripcion_servicio;
	}

	public void setDescripcion_servicio(String descripcion_servicio) {
		this.descripcion_servicio = descripcion_servicio;
	}

	public Integer getPrecio_metro() {
		return precio_metro;
	}

	public void setPrecio_metro(Integer precio_metro) {
		this.precio_metro = precio_metro;
	}

	
	

}
