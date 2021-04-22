package com.oscar.jardineria.dtos;

public class ServiciosDTO {

	public int idServicios;
	public String descripcionServicio;
	public int precioMetro;
	
	
	public ServiciosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiciosDTO(int idServicios, String descripcionServicio, int precioMetro) {
		super();
		this.idServicios = idServicios;
		this.descripcionServicio = descripcionServicio;
		this.precioMetro = precioMetro;
	}
	public int getIdServicios() {
		return idServicios;
	}
	public void setIdServicios(int idServicios) {
		this.idServicios = idServicios;
	}
	public String getDescripcionServicio() {
		return descripcionServicio;
	}
	public void setDescripcionServicio(String descripcionServicio) {
		this.descripcionServicio = descripcionServicio;
	}
	public int getPrecioMetro() {
		return precioMetro;
	}
	public void setPrecioMetro(int precioMetro) {
		this.precioMetro = precioMetro;
	}
	
	
}
