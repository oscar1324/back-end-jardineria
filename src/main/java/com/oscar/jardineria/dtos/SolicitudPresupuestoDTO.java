package com.oscar.jardineria.dtos;

public class SolicitudPresupuestoDTO {
	
	private String user;
	private Integer terreno;
	private String comentario;
	private Integer servicio;
	
	
	
	public SolicitudPresupuestoDTO(String user, Integer terreno, String comentario, Integer servicio) {
		super();
		this.user = user;
		this.terreno = terreno;
		this.comentario = comentario;
		this.servicio = servicio;
	}
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Integer getTerreno() {
		return terreno;
	}
	public void setTerreno(Integer terreno) {
		this.terreno = terreno;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Integer getServicio() {
		return servicio;
	}
	public void setServicio(Integer servicio) {
		this.servicio = servicio;
	}
	
	
}
