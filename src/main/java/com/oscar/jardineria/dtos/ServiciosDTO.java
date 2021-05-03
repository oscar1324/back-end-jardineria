package com.oscar.jardineria.dtos;

/**
 * @author Óscar Izquierdo
 * Fichero donde se almacenan todos las variables de los servicios
 */


public class ServiciosDTO {

	public Integer id_servicios;
	public String descripcion_servicio;
	public Integer precio_metro;
	
	
	public ServiciosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ServiciosDTO(Integer id_servicios, String descripcion_servicio, Integer precio_metro) {
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
