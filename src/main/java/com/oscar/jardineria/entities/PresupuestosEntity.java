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
 * Entidad de la tabla presupuestos de la base de datos jardineriasl
 */

@Entity
@Table(name = "presupuestos")
public class PresupuestosEntity {
	
	//Preguntar si tengo que relacionarlo con más entidades
	
	@Id
	@Column(name = "idPresupuestos")
	private Integer idPresupuestos;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "username") 
	private UserEntity username;
	
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


	public PresupuestosEntity(Integer idPresupuestos, UserEntity username, Integer cantidadTerreno,
			String fechaPresupuesto, String comentario) {
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


	public UserEntity getUsername() {
		return username;
	}


	public void setUsername(UserEntity username) {
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
