package com.oscar.jardineria.dtos;

/**
 * @author Óscar Izquierdo
 * Fichero donde se almacenan todos las variables de los servicios
 */


public class ServiciosDTO {

	public Integer idServicios;
	public String descripcionServicio;
	public Integer precioMetro;
	
	
	public ServiciosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ServiciosDTO(Integer idServicios, String descripcionServicio, Integer precioMetro) {
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
