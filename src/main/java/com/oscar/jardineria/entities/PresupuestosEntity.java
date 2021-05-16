package com.oscar.jardineria.entities;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_presupuestos")
	private Integer id_presupuestos;
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name = "username") 
	private UserEntity username;
	
	@Column(name = "cantidad_terreno")
	private Integer cantidad_terreno;
	
	@Column(name = "fecha_presupuesto")
	private String fecha_presupuesto;
	
	@Column(name = "comentario")
	private String comentario;
	
	@Column(name = "disabled")
	private Integer disabled;
	
	@Column(name = "precio")
	private Double precio;

	public PresupuestosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PresupuestosEntity(Integer id_presupuestos, UserEntity username, Integer cantidad_terreno,
			String fecha_presupuesto, String comentario, Integer disabled, Double precio) {
		super();
		this.id_presupuestos = id_presupuestos;
		this.username = username;
		this.cantidad_terreno = cantidad_terreno;
		this.fecha_presupuesto = fecha_presupuesto;
		this.comentario = comentario;
		this.disabled = disabled;
		this.precio = precio;
	}

	public PresupuestosEntity(Integer id_presupuestos2, Double precio2) {
		this.id_presupuestos = id_presupuestos2;
		this.precio = precio2;
	}

	public PresupuestosEntity(Double precio2) {
		this.precio = precio2;
	}

	public Integer getId_presupuestos() {
		return id_presupuestos;
	}

	public void setId_presupuestos(Integer id_presupuestos) {
		this.id_presupuestos = id_presupuestos;
	}

	public UserEntity getUsername() {
		return username;
	}

	public void setUsername(UserEntity username) {
		this.username = username;
	}

	public Integer getCantidad_terreno() {
		return cantidad_terreno;
	}

	public void setCantidad_terreno(Integer cantidad_terreno) {
		this.cantidad_terreno = cantidad_terreno;
	}

	public String getFecha_presupuesto() {
		return fecha_presupuesto;
	}

	public void setFecha_presupuesto(String fecha_presupuesto) {
		this.fecha_presupuesto = fecha_presupuesto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getDisabled() {
		return disabled;
	}

	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	
}