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
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_presupuestos")
	private Integer idPresupuestos;
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name = "username") 
	private UserEntity username;
	
	@Column(name = "cantidad_terreno")
	private Integer cantidadTerreno;
	
	@Column(name = "fecha_presupuesto")
	private String fechaPresupuesto;
	
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

	public PresupuestosEntity(Integer idPresupuestos, UserEntity username, Integer cantidadTerreno,
			String fechaPresupuesto, String comentario, Integer disabled, Double precio) {
		super();
		this.idPresupuestos = idPresupuestos;
		this.username = username;
		this.cantidadTerreno = cantidadTerreno;
		this.fechaPresupuesto = fechaPresupuesto;
		this.comentario = comentario;
		this.disabled = disabled;
		this.precio = precio;
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