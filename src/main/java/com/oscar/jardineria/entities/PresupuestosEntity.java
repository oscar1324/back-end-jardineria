package com.oscar.jardineria.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Óscar Izquierdo
 * Entidad de la tabla presupuestos de la base de datos jardineriasl
 */

@Entity
@Table(name = "presupuestos")
public class PresupuestosEntity {
	
	//Preguntar si tengo que relacionarlo con más entidades
	
	@Id
	@Column(name = "idPresupuestos")
	private Integer idPresupuestos;
	
	// Conectar con users ----------------- PREGUNTAR --- Lo he cambiado a integer para probar pero es erroneo
	@Column(name = "username")
	private String username;
	
	@Column(name = "cantidadTerreno")
	private Integer cantidadTerreno;
	
	@Column(name = "fechaPresupuesto")
	private String fechaPresupuesto;
	
	@Column(name = "comentario")
	private String comentario;


	public PresupuestosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PresupuestosEntity(Integer idPresupuestos, String username, Integer cantidadTerreno, String fechaPresupuesto,
			String comentario) {
		super();
		this.idPresupuestos = idPresupuestos;
		this.username = username;
		this.cantidadTerreno = cantidadTerreno;
		this.fechaPresupuesto = fechaPresupuesto;
		this.comentario = comentario;
	}


	public Integer getIdPresupuestos() {
		return idPresupuestos;
	}


	public void setIdPresupuestos(Integer idPresupuestos) {
		this.idPresupuestos = idPresupuestos;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Integer getCantidadTerreno() {
		return cantidadTerreno;
	}


	public void setCantidadTerreno(Integer cantidadTerreno) {
		this.cantidadTerreno = cantidadTerreno;
	}


	public String getFechaPresupuesto() {
		return fechaPresupuesto;
	}


	public void setFechaPresupuesto(String fechaPresupuesto) {
		this.fechaPresupuesto = fechaPresupuesto;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}





}
